/**
 * 
 */
package com.git.web.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8958558763922192936L;
	private String employeeId;
	private String employeeName;

	/**
	 * 
	 */
	public Employee() {
		// No Argument Constructor
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 */
	public Employee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
