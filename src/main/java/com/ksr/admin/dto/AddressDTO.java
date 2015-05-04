package com.ksr.admin.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="b_address")
public class AddressDTO{

	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addressId;
	@Column(name = "city", unique = true,nullable = false, length = 45)
	@NotEmpty
	private String city;
	@Column(name = "state", unique = true,nullable = false, length = 45)
	@NotEmpty
	private String state;
	@Column(name = "country", unique = true,nullable = false, length = 45)
	@NotEmpty
	private String country;
	@Column(name = "address", unique = true,nullable = false, length = 45)
	@NotEmpty
	private String address;
	@Column(name = "pin_code", unique = true,nullable = false, length = 500)
	@NotEmpty
	private long pincode;
	@Column(name = "phone_number", unique = true,nullable = false, length = 10)
	@NotEmpty
	private long phoneNumber;
	@ManyToOne
	@JoinColumn(name="user_id")	
	private UserDTO userDTO;
	@Column(name="created_date",nullable = true)
	private Timestamp createdDate;	
	@Column(name="modified_date",nullable = true)
	private Timestamp mofiedDate;	
	@Column(name="is_active",nullable = false)
	private int isActive;
	
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getMofiedDate() {
		return mofiedDate;
	}
	public void setMofiedDate(Timestamp mofiedDate) {
		this.mofiedDate = mofiedDate;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
