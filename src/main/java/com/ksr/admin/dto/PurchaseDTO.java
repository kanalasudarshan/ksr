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
		private long purchaseTypeId;
		@Column(name="purchase_amount")
		private double purhcaseAmount;
		@Column(name="purchase_interest")
		private double purchaseInterest;
		@Column(name="purchase_recurence")
		private int payementRecurrence;
		@Column(name="emi_months")
		private int emiMonths;
		@Column(name="user_id")
		private long userId;		
		@Column(name="created_date")
		private Timestamp createdDate;
		
		
		
		
}
