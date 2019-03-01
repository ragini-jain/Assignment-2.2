package com.glo.EmployeeApp.model;

public class Employee {

	private String name;
	private int age;
	private String designation;
	private EducationDetail educationDetail;
	private Employment employment;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	/**
	 * @return the educationDetail
	 */
	public EducationDetail getEducationDetail() {
		return educationDetail;
	}
	/**
	 * @param educationDetail the educationDetail to set
	 */
	public void setEducationDetail(EducationDetail educationDetail) {
		this.educationDetail = educationDetail;
	}
	/**
	 * @return the employment
	 */
	public Employment getEmployment() {
		return employment;
	}
	/**
	 * @param employment the employment to set
	 */
	public void setEmployment(Employment employment) {
		this.employment = employment;
	}
	public Employee(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", age=").append(age).append(", designation=")
				.append(designation).append("]");
		return builder.toString();
	}
	public Employee(String name, int age, String designation, EducationDetail educationDetail, Employment employment) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.educationDetail = educationDetail;
		this.employment = employment;
	}
	
	
}
