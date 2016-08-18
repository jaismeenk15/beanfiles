package package1;

import java.sql.Date;

public class Order_details {
	private int customer_id;
	private int store_id;
	private int product_id;
	private int quantity;
	private Date dateoforder;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(Date dateoforder) {
		this.dateoforder = dateoforder;
	}

}
