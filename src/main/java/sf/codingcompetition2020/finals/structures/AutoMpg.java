package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class AutoMpg {
	private int mpg;
	private int cylinders;
	private int displacement;
	private int horsepower;
	private int weight;
	private double acceleration;
	private int modelYear;
	private String origin; // this is multi-valued discrete
	private String carName;

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
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
