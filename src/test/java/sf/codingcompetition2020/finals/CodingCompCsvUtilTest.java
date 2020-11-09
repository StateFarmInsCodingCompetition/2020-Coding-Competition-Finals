package sf.codingcompetition2020.finals;

import java.util.List;

import org.junit.Test;

import sf.codingcompetition2020.finals.structures.Adult;
import sf.codingcompetition2020.finals.structures.Auto;
import sf.codingcompetition2020.finals.structures.AutoMpg;
import sf.codingcompetition2020.finals.structures.Car;
import sf.codingcompetition2020.finals.structures.ForestFire;
import sf.codingcompetition2020.finals.structures.SeoulBikeData;

public class CodingCompCsvUtilTest{
	
	private final String adultFilePath = "src/main/resources/DataFiles/adults.csv";
	private final String autoMpgFilePath = "src/main/resources/DataFiles/auto-mpg.csv";
	private final String autosFilePath = "src/main/resources/DataFiles/autos.csv";
	private final String carsFilePath = "src/main/resources/DataFiles/cars.csv";
	private final String forestFiresFilePath = "src/main/resources/DataFiles/forest-fires.csv";
	private final String seoulBikeDataFilePath = "src/main/resources/DataFiles/seoul-bike-data.csv";
	
	CodingCompCsvUtil codingCompCsvUtil = new CodingCompCsvUtil();
	
	//Reading Files Example
	@Test
	public void test1() {
		List<Adult> adults = codingCompCsvUtil.readCsvFile(adultFilePath, Adult.class);
		List<AutoMpg> autosMpg = codingCompCsvUtil.readCsvFile(autoMpgFilePath, AutoMpg.class);
		List<Auto> autos = codingCompCsvUtil.readCsvFile(autosFilePath, Auto.class);
		List<Car> cars = codingCompCsvUtil.readCsvFile(carsFilePath, Car.class);
		List<ForestFire> forestFires = codingCompCsvUtil.readCsvFile(forestFiresFilePath, ForestFire.class);
		List<SeoulBikeData> seoulBikeData = codingCompCsvUtil.readCsvFile(seoulBikeDataFilePath, SeoulBikeData.class);		
	}
	
	

}

