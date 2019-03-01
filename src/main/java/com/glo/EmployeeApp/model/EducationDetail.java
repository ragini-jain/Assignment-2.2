package com.glo.EmployeeApp.model;

public class EducationDetail {

	private String degree;
    private  String percent;
    private String date;
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * @return the percent
	 */
	public String getPercent() {
		return percent;
	}
	/**
	 * @param percent the percent to set
	 */
	public void setPercent(String percent) {
		this.percent = percent;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	public EducationDetail(String degree, String percent, String date) {
		super();
		this.degree = degree;
		this.percent = percent;
		this.date = date;
	}
	public EducationDetail() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EducationDetail [degree=").append(degree).append(", percent=").append(percent).append(", date=")
				.append(date).append("]");
		return builder.toString();
	}
    
    
    
}
