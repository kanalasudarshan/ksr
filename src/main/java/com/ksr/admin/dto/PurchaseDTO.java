package com.ksr.admin.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="b_purchase")
public class PurchaseDTO {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="purchase_id")
		private long purchaseId;
		@Column(name="purchase")
		private String purchase;
		@Column(name="purchase_type_id")
		private long purhcaseType;
		@Column(name="purchase_amount")
		private double purhcaseAmount;
		@Column(name="user_id")
		private long userId;
		@Column(name="is_active")
		private int isActive;
		@Column(name="created_by")
		private long createdBy;
		@Column(name="created_date")
		private Timestamp createdDate;
		
		
		public long getPurchaseId() {
			return purchaseId;
		}
		public void setPurchaseId(long purchaseId) {
			this.purchaseId = purchaseId;
		}
		public String getPurchase() {
			return purchase;
		}
		public void setPurchase(String purchase) {
			this.purchase = purchase;
		}
		public long getPurhcaseType() {
			return purhcaseType;
		}
		public void setPurhcaseType(long purhcaseType) {
			this.purhcaseType = purhcaseType;
		}
		public double getPurhcaseAmount() {
			return purhcaseAmount;
		}
		public void setPurhcaseAmount(double purhcaseAmount) {
			this.purhcaseAmount = purhcaseAmount;
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public int getIsActive() {
			return isActive;
		}
		public void setIsActive(int isActive) {
			this.isActive = isActive;
		}
		public long getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(long createdBy) {
			this.createdBy = createdBy;
		}
		public Timestamp getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Timestamp createdDate) {
			this.createdDate = createdDate;
		}
		
		
		
}
