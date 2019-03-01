package com.glo.EmployeeApp.model;

public class Employment {

	private String organizationName;
	private int duration;
	private String project;
	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
	public Employment(String organizationName, int duration, String project) {
		super();
		this.organizationName = organizationName;
		this.duration = duration;
		this.project = project;
	}
	public Employment() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employment [organizationName=").append(organizationName).append(", duration=").append(duration)
				.append(", project=").append(project).append("]");
		return builder.toString();
	}
	
	
	
	
}
