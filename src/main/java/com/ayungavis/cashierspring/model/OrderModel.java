package com.ayungavis.cashierspring.model;

public class OrderModel {
	private long id;
	private String customer_name;
	private String item_name;
	private int item_amount;
	private long price;
	private long payment;
	private long total_price;
	private long refund;
	
	public long getId() {
		return id;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public String getItem_name() {
		return item_name;
	}
	
	public int getItem_amount() {
		return item_amount;
	}
	
	public long getPrice() {
		return price;
	}
	
	public long getPayment() {
		return payment;
	}
	
	public long getTotal_price() {
		return total_price;
	}
	
	public long getRefund() {
		return refund;
	}	
}
