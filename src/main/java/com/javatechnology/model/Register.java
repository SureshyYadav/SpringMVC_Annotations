package com.javatechnology.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;




@Entity
@Table
public class Register implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	//@NotEmpty
	@Pattern(regexp="[a-zA-Z]*",message="username cann't include numbers")
	@Column
	private String username;
	@NotEmpty
	@Size(min=6,max=10, message="the Password must be 6 characters")
	@Column
	private String password;
	@NotEmpty
	@Pattern(regexp="[a-zA-Z]*",message="firstName cann't include numbers")
	@Column
	private String firstName;
	@NotEmpty
	@Pattern(regexp="[a-zA-Z]*",message="lastName cann't include numbers")
	@Column
	private String lastName;
	@NotEmpty
	@Pattern(regexp="[a-zA-Z]*",message="emal cann't include numbers")
	@Column
	private String email;
	@NotEmpty
	@Pattern(regexp="[a-zA-Z]*",message="address cann't include numbers")
	@Column
	private String address;
	@NotEmpty
	@Pattern(regexp="[0-9]*",message="phoneNumber cann't include characters")
	@Column
	private String phoneNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
