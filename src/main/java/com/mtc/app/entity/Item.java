package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	private int sku_num;
	private String sku_name;
	private double price;
	private int quantity;
	private String category;
	
	
	public Item() {
		
	}


	public Item(int sku_num, String sku_name, double price, int quantity, String category) {
		super();
		this.sku_num = sku_num;
		this.sku_name = sku_name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}


	@Override
	public String toString() {
		return "ItemDetails [sku_num=" + sku_num + ", sku_name=" + sku_name + ", price=" + price + ", quantity="
				+ quantity + ", category=" + category + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + ((sku_name == null) ? 0 : sku_name.hashCode());
		result = prime * result + sku_num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (sku_name == null) {
			if (other.sku_name != null)
				return false;
		} else if (!sku_name.equals(other.sku_name))
			return false;
		if (sku_num != other.sku_num)
			return false;
		return true;
	}


	public int getSku_num() {
		return sku_num;
	}


	public void setSku_num(int sku_num) {
		this.sku_num = sku_num;
	}


	public String getSku_name() {
		return sku_name;
	}


	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
