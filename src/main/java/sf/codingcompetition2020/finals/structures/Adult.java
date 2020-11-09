package sf.codingcompetition2020.finals.structures;

//Feel free to change this class however you please
public class Adult {
	private String age;
	private String workclass;
	private String fnlwgt;
	private String education;
	private String educationNum;
	private String maritalStatus;
	private String occupation;
	private String relationship;
	private String race;
	private String sex;
	private String capitalGain;
	private String capitalLoss;
	private String hoursPerWeek;
	private String nativeCountry;
	private String probabilityLabel;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWorkclass() {
		return workclass;
	}
	public void setWorkclass(String workclass) {
		this.workclass = workclass;
	}
	public String getFnlwgt() {
		return fnlwgt;
	}
	public void setFnlwgt(String fnlwgt) {
		this.fnlwgt = fnlwgt;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEducationNum() {
		return educationNum;
	}
	public void setEducationNum(String educationNum) {
		this.educationNum = educationNum;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCapitalGain() {
		return capitalGain;
	}
	public void setCapitalGain(String capitalGain) {
		this.capitalGain = capitalGain;
	}
	public String getCapitalLoss() {
		return capitalLoss;
	}
	public void setCapitalLoss(String capitalLoss) {
		this.capitalLoss = capitalLoss;
	}
	public String getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public String getNativeCountry() {
		return nativeCountry;
	}
	public void setNativeCountry(String nativeCountry) {
		this.nativeCountry = nativeCountry;
	}
	public String getProbabilityLabel() {
		return probabilityLabel;
	}
	public void setProbabilityLabel(String probabilityLabel) {
		this.probabilityLabel = probabilityLabel;
	}
	
	@Override
	public String toString() {
		return "Adult [age=" + age + ", workclass=" + workclass + ", fnlwgt=" + fnlwgt + ", education=" + education
				+ ", educationNum=" + educationNum + ", maritalStatus=" + maritalStatus + ", occupation=" + occupation
				+ ", relationship=" + relationship + ", race=" + race + ", sex=" + sex + ", capitalGain=" + capitalGain
				+ ", capitalLoss=" + capitalLoss + ", hoursPerWeek=" + hoursPerWeek + ", nativeCountry=" + nativeCountry
				+ ", probabilityLabel=" + probabilityLabel + "]";
	}	
}
