package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class AutoMpg {
	private String mpg;
	private String cylinders;
	private String displacement;
	private String horsepower;
	private String weight;
	private String acceleration;
	private String modelYear;
	private String origin;
	private String carName;
	
	public String getMpg() {
		return mpg;
	}
	public void setMpg(String mpg) {
		this.mpg = mpg;
	}
	public String getCylinders() {
		return cylinders;
	}
	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	@Override
	public String toString() {
		return "AutoMpg [mpg=" + mpg + ", cylinders=" + cylinders + ", displacement=" + displacement + ", horsepower="
				+ horsepower + ", weight=" + weight + ", acceleration=" + acceleration + ", modelYear=" + modelYear
				+ ", origin=" + origin + ", carName=" + carName + "]";
	}
}
