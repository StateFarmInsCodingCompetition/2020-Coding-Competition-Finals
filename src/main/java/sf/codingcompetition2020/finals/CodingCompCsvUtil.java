package sf.codingcompetition2020.finals;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CodingCompCsvUtil {
	static class CodingCompCsvErrorHandler extends DeserializationProblemHandler {
		@Override
		public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetType, String valueToConvert, String failureMsg) throws IOException {
			if (valueToConvert.equals("?")) {
				System.out.println("Suppressing error " + failureMsg);
				return null;
			}
			return NOT_HANDLED;
		}
	}

	private final CodingCompCsvErrorHandler errorHandler = new CodingCompCsvErrorHandler();
	
	//read a CSV File and return a List of that File
	public <T> List<T> readCsvFile(String filePath, Class<T> classType) {
		List<T> resultsList = new ArrayList<>();
		CsvMapper csvMapper = new CsvMapper(); 
		csvMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);;
		CsvSchema schema = CsvSchema.emptySchema().withHeader();
		csvMapper.addHandler(errorHandler);
		
		ObjectReader oReader = csvMapper.readerFor(classType).with(schema);
		try (Reader reader = new FileReader(filePath)) {
			MappingIterator<T> mi = oReader.readValues(reader);
			
			while (mi.hasNext()) {
				resultsList.add(mi.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultsList;
	}
	
}