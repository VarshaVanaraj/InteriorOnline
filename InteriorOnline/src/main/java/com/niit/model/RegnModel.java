package com.niit.model;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "customer")
public class RegnModel {
	
	private String name;
	@NotEmpty
	@Size(min = 4, max = 20)
	private String pwd;
	@NotEmpty
	private String cpwd;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String uname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	}
