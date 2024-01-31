package com.hospitalDetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient Details")
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "First Name")
	private String first_name;

	@Column(name = "Last Name")
	private String last_name;

	@Column(name = "Contact Details")
	private long contact_details;

	@Column(name = "Address")
	private String address;

	@Column(name = "Email")
	private String email;

	//	public PatientDetails(int id, String first_name, String last_name, long contact_details, String address,
//			String email) {
//		super();
//		this.id = id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.contact_details = contact_details;
//		this.address = address;
//		this.email = email;
//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getContact_details() {
		return contact_details;
	}

	public void setContact_details(long contact_details) {
		this.contact_details = contact_details;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	@Override
//	public String toString() {
//		return "PatientDetails [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
//				+ ", contact_details=" + contact_details + ", address=" + address + ", email=" + email + "]";
//	}

}
