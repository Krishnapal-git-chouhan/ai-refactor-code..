package com.hiber.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	
	@Column(name = "stu_name",length = 100)
	private String name;
	
	@Column(name = "stu_clg", length = 200)
	private String clg;
	
	private String phone;
	
	private String fatherName;
	
	private boolean active = true;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true )
	private List<Stu_Certificate> certi = new ArrayList<>();
	
}
