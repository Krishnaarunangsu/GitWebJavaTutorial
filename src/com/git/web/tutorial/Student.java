/**
 * 
 */
package com.git.web.tutorial;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8960390901102929463L;
	private String studentId;
	private String studentName;
	private String studentAddress;
	private String studentGrade;

	/**
	 * 
	 */
	public Student() {
		// No Argument Constructor
	}

	/**
	 * @param studentId
	 * @param studentName
	 */
	public Student(String studentId, String studentName, String studentAddress, String studentGrade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentGrade = studentGrade;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentAddress
	 */
	public String getStudentAddress() {
		return studentAddress;
	}

	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	/**
	 * @return the studentGrade
	 */
	public String getStudentGrade() {
		return studentGrade;
	}

	/**
	 * @param studentGrade the studentGrade to set
	 */
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
}
