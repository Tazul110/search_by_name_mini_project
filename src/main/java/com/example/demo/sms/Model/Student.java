package com.example.demo.sms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="student")
@Entity(name="student")
public class Student {
 @Id
 private int sId;
 private String sName;
 private String sEmail;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsEmail() {
	return sEmail;
}
public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}



public Student() {
	
}
public Student(int sId, String sName, String sEmail) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sEmail = sEmail;
}
 
 
 


}
