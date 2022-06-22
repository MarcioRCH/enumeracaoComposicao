package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	private Employee employee;
	private Address address;
	
	private List<Employee> emps = new ArrayList<>();
	
	public Department() {
		
	}
	public Department(String name, Integer payDay, Employee employee, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.employee = employee;
		this.address = address;
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Employee> getEmp(){
		return emps;
	}
	public void addEmp(Employee emp) {
		emps.add(emp);
	}
	public void removeEmp(Employee emp) {
		emps.remove(emp);
	}
}