package com.tutorial.HibernateTutorial.mappingRelations;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int rollNo;
	
	private String name;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	/*
	 * If mappedBy is not given, then a separate table Student_laptop is created.
	 * mappedBy = the field name in the other class.
	 */
	private List<Laptop> laptop;

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

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
