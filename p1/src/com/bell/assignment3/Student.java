package com.bell.assignment3;

class Student {
	int id;
	String name;
	double fee;
	char section;
	Student(int id,String name,double fee,char section){
	this.id=id;
	this.name=name;
	this.fee = fee;
	this.section=section;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	

}
