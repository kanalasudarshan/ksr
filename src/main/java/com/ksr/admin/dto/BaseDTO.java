package com.ksr.admin.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BaseDTO {

	@Column(name="is_active",nullable = true)
	private int isActive;
	@Column(name="is_deleted",nullable = true)
	private int isDeleted;
	@Column(name="created_by",nullable = true)
	private long createdBy;
	@Column(name="modified_by",nullable = true)
	private long modifiedBy;
	@Column(name="created_date",nullable = true)
	private Timestamp createdDate;
	@Column(name="modified_date",nullable = true)
	private Timestamp modifiedDate;
	
	
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
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
	
}
