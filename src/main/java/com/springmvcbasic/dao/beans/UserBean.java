/**
 * 
 */
package com.springmvcbasic.dao.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author NEX25RE
 *
 */
@Entity
@Table(name = "userreg")
public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -42447582914763264L;
	
	@Id
	@Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="logon_id",nullable = false, unique = true)
	private String logonId;
	
	@Column
	private String password;
	
	@Column(name="security_question")
	private String sQuestion;
	
	@Column(name="security_answer")
	private String sAnswer;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogonId() {
		return logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getsQuestion() {
		return sQuestion;
	}
	public void setsQuestion(String sQuestion) {
		this.sQuestion = sQuestion;
	}
	public String getsAnswer() {
		return sAnswer;
	}
	public void setsAnswer(String sAnswer) {
		this.sAnswer = sAnswer;
	}
	
	
}
