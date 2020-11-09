package sf.codingcompetition2020.finals;

import com.google.gson.Gson;
import sf.codingcompetition2020.finals.structures.*;
import spark.Request;
import spark.Response;

import java.util.List;

import static spark.Spark.*;

public class DataServer {
    private static final String adultFilePath = "src/main/resources/DataFiles/adults.csv";
    private static final String autoMpgFilePath = "src/main/resources/DataFiles/auto-mpg.csv";
    private static final String autosFilePath = "src/main/resources/DataFiles/autos.csv";
    private static final String carsFilePath = "src/main/resources/DataFiles/cars.csv";
    private static final String forestFiresFilePath = "src/main/resources/DataFiles/forest-fires.csv";
    private static final String seoulBikeDataFilePath = "src/main/resources/DataFiles/seoul-bike-data.csv";

    private final Gson gson = new Gson();
    private final CodingCompCsvUtil codingCompCsvUtil = new CodingCompCsvUtil();

    private <T> String serveData(Request req, Response res, String filePath, Class<T> classType) {
        List<T> data = codingCompCsvUtil.readCsvFile(filePath, classType);

        res.type("application/json");
        return gson.toJson(data);
    }

    public static void main(String[] args) {
        DataServer data = new DataServer();

        path("/api", () -> {
            get("/ping", (req, res) -> "pong");

            path("/data", () -> {
                get("/adults", (req, res) -> {
                    return data.serveData(req, res, adultFilePath, Adult.class);
                });
                get("/autosMpg", (req, res) -> {
                    return data.serveData(req, res, autoMpgFilePath, AutoMpg.class);
                });
                get("/autos", (req, res) -> {
                    return data.serveData(req, res, autosFilePath, Auto.class);
                });
                get("/cars", (req, res) -> {
                    return data.serveData(req, res, carsFilePath, Car.class);
                });
                get("/forestFires", (req, res) -> {
                    return data.serveData(req, res, forestFiresFilePath, ForestFire.class);
                });
                get("/seoulBikeData", (req, res) -> {
                    return data.serveData(req, res, seoulBikeDataFilePath, SeoulBikeData.class);
                });
            });
        });
    }
}
