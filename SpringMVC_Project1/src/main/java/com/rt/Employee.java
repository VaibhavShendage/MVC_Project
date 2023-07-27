package com.rt;

public class Employee {
private int id;
private String fname;
private String mname;
private String sname;
private String dob;
private String mob;
private String address;
private String pincode;
private String emailId;
private String password;

public Employee(){};

public Employee(int id, String fname, String mname, String sname, String dob, String mob, String address,
		String pincode, String emailId, String password) {
	super();
	this.id = id;
	this.fname = fname;
	this.mname = mname;
	this.sname = sname;
	this.dob = dob;
	this.mob = mob;
	this.address = address;
	this.pincode = pincode;
	this.emailId = emailId;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}





}







