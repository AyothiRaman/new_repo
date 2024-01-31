package com.hospitalDetails.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Collected Sample")
public class CollectedSamplesDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Collected Date")
	@Temporal(TemporalType.DATE)
	private Date collected_date = new Date(System.currentTimeMillis());

	@Column(name = "Patient Details")
	private String patient_details;

	@Column(name = "Test Name")
	private String test_name;

	

//	public CollectedSamplesDetails(int id, Date collected_date, String patient_details, String test_name) {
//		super();
//		this.id = id;
//		this.collected_date = collected_date;
//		this.patient_details = patient_details;
//		this.test_name = test_name;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Date getCollected_date() {
//		return collected_date;
//	}
//
//	public void setCollected_date(Date collected_date) {
//		this.collected_date = collected_date;
//	}

	public String getPatient_details() {
		return patient_details;
	}

	public void setPatient_details(String patient_details) {
		this.patient_details = patient_details;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

//	@Override
//	public String toString() {
//		return "CollectedSamplesDetails [id=" + id + ", collected_date=" + collected_date + ", patient_details="
//				+ patient_details + ", test_name=" + test_name + "]";
//	}

}
