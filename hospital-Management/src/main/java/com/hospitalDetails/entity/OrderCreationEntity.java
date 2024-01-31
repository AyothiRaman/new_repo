package com.hospitalDetails.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Order Creation")
public class OrderCreationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Doctor Name")
	private String doctor_name;

	@Column(name = "Patient Name")
	private String patient_name;

	@Column(name = "Checked Date")
	@Temporal(TemporalType.DATE)
	private Date checked_date = new Date(System.currentTimeMillis());

	

//	public OrderCreationEntity(int id, String doctor_name, String patient_name, Date checked_date) {
//		super();
//		this.id = id;
//		this.doctor_name = doctor_name;
//		this.patient_name = patient_name;
//		this.checked_date = checked_date;
//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

//	public Date getChecked_date() {
//		return checked_date;
//	}
//
//	public void setChecked_date(Date checked_date) {
//		this.checked_date = checked_date;
//	}

//	@Override
//	public String toString() {
//		return "OrderCreationEntity [id=" + id + ", doctor_name=" + doctor_name + ", patient_name=" + patient_name
//				+ ", checked_date=" + checked_date + "]";
//	}

}
