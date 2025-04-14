package com.hiber.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "stu_certificate")
public class Stu_Certificate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long certi_id;
	private String title;
	private String name;
	private String author;
	private String link;
	
	@ManyToOne
	@JoinColumn(name = "student")
	private Student student;
}
