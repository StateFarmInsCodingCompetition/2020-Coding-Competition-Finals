package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class Auto {
	private Integer symboling;
	private Integer normalizedLosses;
	private String make;
	private String fuelType;
	private String aspiration;
	private String numOfDoors;
	private String bodyStyle;
	private String driveWheels;
	private String engineLocation;
	private Double wheelBase;
	private Double length;
	private Double width;
	private Double height;
	private Double curbWeight;
	private String engineType;
	private String numOfCylinders;
	private Integer engineSize;
	private String fuelSystem;
	private Double bore;
	private Double stroke;
	private Double compressionRatio;
	private Double horsepower;
	private Double peakRpm;
	private Double cityMpg;
	private Double highwayMpg;
	private Double price;

	public Integer getSymboling() {
		return symboling;
	}

	public void setSymboling(Integer symboling) {
		this.symboling = symboling;
	}

	public Integer getNormalizedLosses() {
		return normalizedLosses;
	}

	public void setNormalizedLosses(Integer normalizedLosses) {
		this.normalizedLosses = normalizedLosses;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getAspiration() {
		return aspiration;
	}

	public void setAspiration(String aspiration) {
		this.aspiration = aspiration;
	}

	public String getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(String numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getDriveWheels() {
		return driveWheels;
	}

	public void setDriveWheels(String driveWheels) {
		this.driveWheels = driveWheels;
	}

	public String getEngineLocation() {
		return engineLocation;
	}

	public void setEngineLocation(String engineLocation) {
		this.engineLocation = engineLocation;
	}

	public Double getWheelBase() {
		return wheelBase;
	}

	public void setWheelBase(Double wheelBase) {
		this.wheelBase = wheelBase;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getCurbWeight() {
		return curbWeight;
	}

	public void setCurbWeight(Double curbWeight) {
		this.curbWeight = curbWeight;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(String numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public Integer getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(Integer engineSize) {
		this.engineSize = engineSize;
	}

	public String getFuelSystem() {
		return fuelSystem;
	}

	public void setFuelSystem(String fuelSystem) {
		this.fuelSystem = fuelSystem;
	}

	public Double getBore() {
		return bore;
	}

	public void setBore(Double bore) {
		this.bore = bore;
	}

	public Double getStroke() {
		return stroke;
	}

	public void setStroke(Double stroke) {
		this.stroke = stroke;
	}

	public Double getCompressionRatio() {
		return compressionRatio;
	}

	public void setCompressionRatio(Double compressionRatio) {
		this.compressionRatio = compressionRatio;
	}

	public Double getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(Double horsepower) {
		this.horsepower = horsepower;
	}

	public Double getPeakRpm() {
		return peakRpm;
	}

	public void setPeakRpm(Double peakRpm) {
		this.peakRpm = peakRpm;
	}

	public Double getCityMpg() {
		return cityMpg;
	}

	public void setCityMpg(Double cityMpg) {
		this.cityMpg = cityMpg;
	}

	public Double getHighwayMpg() {
		return highwayMpg;
	}

	public void setHighwayMpg(Double highwayMpg) {
		this.highwayMpg = highwayMpg;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Autos [symboling=" + symboling + ", normalizedLosses=" + normalizedLosses + ", make=" + make
				+ ", fuelType=" + fuelType + ", aspiration=" + aspiration + ", numOfDoors=" + numOfDoors
				+ ", bodyStyle=" + bodyStyle + ", driveWheels=" + driveWheels + ", engineLocation=" + engineLocation
				+ ", wheelBase=" + wheelBase + ", length=" + length + ", width=" + width + ", height=" + height
				+ ", curbWeight=" + curbWeight + ", engineType=" + engineType + ", numOfCylinders=" + numOfCylinders
				+ ", engineSize=" + engineSize + ", fuelSystem=" + fuelSystem + ", bore=" + bore + ", stroke=" + stroke
				+ ", compressionRatio=" + compressionRatio + ", horsepower=" + horsepower + ", peakRpm=" + peakRpm
				+ ", cityMpg=" + cityMpg + ", highwayMpg=" + highwayMpg + ", price=" + price + "]";
	}

}
