package com.tutorial.HibernateTutorial.hql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_student")
public class NewStudent {

	@Id
	private int rollNo;
	
	private String name;
	
	private int marks;
	
	public NewStudent() {}
	
	public NewStudent(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "NewStudent [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
