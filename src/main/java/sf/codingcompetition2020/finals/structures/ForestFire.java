package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class ForestFire {
	private Double x;
	private Double y;
	private String month;
	private String day;
	private Double ffmc;
	private Double dmc;
	private Double dc;
	private Double isi;
	private Double temp;
	private Double rh;
	private Double wind;
	private Double rain;
	private Double area;

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Double getFfmc() {
		return ffmc;
	}

	public void setFfmc(Double ffmc) {
		this.ffmc = ffmc;
	}

	public Double getDmc() {
		return dmc;
	}

	public void setDmc(Double dmc) {
		this.dmc = dmc;
	}

	public Double getDc() {
		return dc;
	}

	public void setDc(Double dc) {
		this.dc = dc;
	}

	public Double getIsi() {
		return isi;
	}

	public void setIsi(Double isi) {
		this.isi = isi;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getRh() {
		return rh;
	}

	public void setRh(Double rh) {
		this.rh = rh;
	}

	public Double getWind() {
		return wind;
	}

	public void setWind(Double wind) {
		this.wind = wind;
	}

	public Double getRain() {
		return rain;
	}

	public void setRain(Double rain) {
		this.rain = rain;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "ForestFire [x=" + x + ", y=" + y + ", month=" + month + ", day=" + day + ", ffmc=" + ffmc + ", dmc="
				+ dmc + ", dc=" + dc + ", isi=" + isi + ", temp=" + temp + ", rh=" + rh + ", wind=" + wind + ", rain="
				+ rain + ", area=" + area + "]";
	}
}
