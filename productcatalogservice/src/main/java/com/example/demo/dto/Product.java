package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author prabhakarambavarapu
 *
 */
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="supplier",nullable = false)
	private String supplier;
	
	@Column(name = "brand",nullable = false)
	private String brand;
	
	@Column(name = "product_type")
	private String productType;
	
	@Column(name = "product_colour",nullable = false)
	private String color;
	
	@Column(name = "product_price",nullable = false)
	private int price;
	
	@Column(name = "product_size",nullable = false)
	private int size;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	
	public Product() {
		super();
	}
	
	
	
	/**
	 * @param id
	 * @param supplier
	 * @param brnad
	 * @param productType
	 * @param colour
	 * @param price
	 * @param size
	 * @param createdDate
	 * @param modifiedDate
	 */
	public Product(int id, String supplier, String brnad, String productType, String color, int price, int size,
			Date createdDate, Date modifiedDate) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.brand = brnad;
		this.productType = productType;
		this.color = color;
		this.price = price;
		this.size = size;
		this.createdDate = createdDate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brnad) {
		this.brand = brnad;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	
	

}
