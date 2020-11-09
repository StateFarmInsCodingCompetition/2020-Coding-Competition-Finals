package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class ForestFire {
	private String x;
	private String y;
	private String month;
	private String day;
	private String ffmc;
	private String dmc;
	private String dc;
	private String isi;
	private String temp;
	private String rh;
	private String wind;
	private String rain;
	private String area;
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
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
	public String getFfmc() {
		return ffmc;
	}
	public void setFfmc(String ffmc) {
		this.ffmc = ffmc;
	}
	public String getDmc() {
		return dmc;
	}
	public void setDmc(String dmc) {
		this.dmc = dmc;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getIsi() {
		return isi;
	}
	public void setIsi(String isi) {
		this.isi = isi;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getRain() {
		return rain;
	}
	public void setRain(String rain) {
		this.rain = rain;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "ForestFire [x=" + x + ", y=" + y + ", month=" + month + ", day=" + day + ", ffmc=" + ffmc + ", dmc="
				+ dmc + ", dc=" + dc + ", isi=" + isi + ", temp=" + temp + ", rh=" + rh + ", wind=" + wind + ", rain="
				+ rain + ", area=" + area + "]";
	}
}
