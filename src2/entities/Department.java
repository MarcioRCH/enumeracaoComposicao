package entities;

public class Department {
	
	private String name;
	private Integer payDay;
	
	public Department() {
		
	}
	public Department(String name, Integer payday) {
		this.name = name;
		this.payDay = payDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPayDay() {
		return payDay;
	}
	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}
}
