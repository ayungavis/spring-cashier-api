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
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getItem_name() {
		return item_name;
	}
	
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	public int getItem_amount() {
		return item_amount;
	}
	
	public void setItem_amount(int item_amount) {
		this.item_amount = item_amount;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getPayment() {
		return payment;
	}
	
	public void setPayment(long payment) {
		this.payment = payment;
	}
	
	public long getTotal_price() {
		return total_price;
	}
	
	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}
	
	public long getRefund() {
		return refund;
	}
	
	public void setRefund(long refund) {
		this.refund = refund;
	}
}
