package com.ksr.admin.dto;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="b_user")
public class UserDTO{	
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;	
	@NotEmpty
	@Size(min=5,max=50)
	@Column(name = "user_name", unique = true,nullable = false, length = 45)
   	private String userName;	
	@Column
	@NotEmpty
	@Size(min=5,max=15)
	private String password;	
	@NotEmpty
	@Size(min=5,max=50)
	@Column(name="first_name",nullable = false)
	private String firstName;
	@Column(name="last_name",nullable = false)
	private String lastName;
	@Column(name="gender",nullable = true)
	private long gender;	
	@Column(name="is_active",nullable = false)
	private int isActive;
	@Column(name="is_deleted",nullable = false)
	private int isDeleted;		
	@Column(name="created_date",nullable = true)
	private Timestamp createdDate;	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=AddressDTO.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName="user_id") 
	private Set<AddressDTO> addressDTO;
		
	
	
	public Set<AddressDTO> getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(Set<AddressDTO> addressDTO) {
		this.addressDTO = addressDTO;
	}
	public long getUserId() {
		return userId;
	}	
	public void setUserId(long userId) {
		this.userId = userId;
	}	
	public String getUserName() {
		return this.userName;
	}	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}	
	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}
	public String getLastName() {
		return lastName;
	}	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getGender() {
		return gender;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gender")
	public void setGender(long gender) {
		this.gender = gender;
	}	
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
		
	

}
