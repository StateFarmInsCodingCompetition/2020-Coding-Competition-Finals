package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class AutoMpg {
	private Double mpg;
	private Integer cylinders;
	private Double displacement;
	private Integer horsepower;
	private Integer weight;
	private Double acceleration;
	private Integer modelYear;
	private String origin; // this is multi-valued discrete
	private String carName;

	public Double getMpg() {
		return mpg;
	}

	public void setMpg(Double mpg) {
		this.mpg = mpg;
	}

	public Integer getCylinders() {
		return cylinders;
	}

	public void setCylinders(Integer cylinders) {
		this.cylinders = cylinders;
	}

	public Double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}

	public Integer getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(Integer horsepower) {
		this.horsepower = horsepower;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
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
