package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class SeoulBikeData {
	private String date;
	private String rentedBikeCount;
	private String hour;
	private String temperatureC;
	private String humidityPercent;
	private String windSpeedMS;
	private String visibility10m;
	private String dewPointTemperatureC;
	private String solarRadiation;
	private String rainfall;
	private String snowfall;
	private String seasons;
	private String holiday;
	private String functioningDay;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRentedBikeCount() {
		return rentedBikeCount;
	}
	public void setRentedBikeCount(String rentedBikeCount) {
		this.rentedBikeCount = rentedBikeCount;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getTemperatureC() {
		return temperatureC;
	}
	public void setTemperatureC(String temperatureC) {
		this.temperatureC = temperatureC;
	}
	public String getHumidityPercent() {
		return humidityPercent;
	}
	public void setHumidityPercent(String humidityPercent) {
		this.humidityPercent = humidityPercent;
	}
	public String getWindSpeedMS() {
		return windSpeedMS;
	}
	public void setWindSpeedMS(String windSpeedMS) {
		this.windSpeedMS = windSpeedMS;
	}
	public String getVisibility10m() {
		return visibility10m;
	}
	public void setVisibility10m(String visibility10m) {
		this.visibility10m = visibility10m;
	}
	public String getDewPointTemperatureC() {
		return dewPointTemperatureC;
	}
	public void setDewPointTemperatureC(String dewPointTemperatureC) {
		this.dewPointTemperatureC = dewPointTemperatureC;
	}
	public String getSolarRadiation() {
		return solarRadiation;
	}
	public void setSolarRadiation(String solarRadiation) {
		this.solarRadiation = solarRadiation;
	}
	public String getRainfall() {
		return rainfall;
	}
	public void setRainfall(String rainfall) {
		this.rainfall = rainfall;
	}
	public String getSnowfall() {
		return snowfall;
	}
	public void setSnowfall(String snowfall) {
		this.snowfall = snowfall;
	}
	public String getSeasons() {
		return seasons;
	}
	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public String getFunctioningDay() {
		return functioningDay;
	}
	public void setFunctioningDay(String functioningDay) {
		this.functioningDay = functioningDay;
	}
	
	@Override
	public String toString() {
		return "SeoulBikeData [date=" + date + ", rentedBikeCount=" + rentedBikeCount + ", hour=" + hour
				+ ", temperatureC=" + temperatureC + ", humidityPercent=" + humidityPercent + ", windSpeedMS="
				+ windSpeedMS + ", visibility10m=" + visibility10m + ", dewPointTemperatureC=" + dewPointTemperatureC
				+ ", solarRadiation=" + solarRadiation + ", rainfall=" + rainfall + ", snowfall=" + snowfall
				+ ", seasons=" + seasons + ", holiday=" + holiday + ", functioningDay=" + functioningDay + "]";
	}
}
