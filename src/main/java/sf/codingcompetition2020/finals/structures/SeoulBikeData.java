package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class SeoulBikeData {
	private String date;
	private Double rentedBikeCount;
	private Double hour;
	private Double temperatureC;
	private Double humidityPercent;
	private Double windSpeedMS;
	private Double visibility10m;
	private Double dewPointTemperatureC;
	private Double solarRadiation;
	private Double rainfall;
	private Double snowfall;
	private String seasons;
	private String holiday;
	private String functioningDay;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getRentedBikeCount() {
		return rentedBikeCount;
	}

	public void setRentedBikeCount(Double rentedBikeCount) {
		this.rentedBikeCount = rentedBikeCount;
	}

	public Double getHour() {
		return hour;
	}

	public void setHour(Double hour) {
		this.hour = hour;
	}

	public Double getTemperatureC() {
		return temperatureC;
	}

	public void setTemperatureC(Double temperatureC) {
		this.temperatureC = temperatureC;
	}

	public Double getHumidityPercent() {
		return humidityPercent;
	}

	public void setHumidityPercent(Double humidityPercent) {
		this.humidityPercent = humidityPercent;
	}

	public Double getWindSpeedMS() {
		return windSpeedMS;
	}

	public void setWindSpeedMS(Double windSpeedMS) {
		this.windSpeedMS = windSpeedMS;
	}

	public Double getVisibility10m() {
		return visibility10m;
	}

	public void setVisibility10m(Double visibility10m) {
		this.visibility10m = visibility10m;
	}

	public Double getDewPointTemperatureC() {
		return dewPointTemperatureC;
	}

	public void setDewPointTemperatureC(Double dewPointTemperatureC) {
		this.dewPointTemperatureC = dewPointTemperatureC;
	}

	public Double getSolarRadiation() {
		return solarRadiation;
	}

	public void setSolarRadiation(Double solarRadiation) {
		this.solarRadiation = solarRadiation;
	}

	public Double getRainfall() {
		return rainfall;
	}

	public void setRainfall(Double rainfall) {
		this.rainfall = rainfall;
	}

	public Double getSnowfall() {
		return snowfall;
	}

	public void setSnowfall(Double snowfall) {
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
