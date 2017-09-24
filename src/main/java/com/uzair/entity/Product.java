package com.uzair.entity;

import org.springframework.data.annotation.Id;

public class Product {
	@Id
    public String id;
    public String name;
    public String description;
    public String category;
    public int price;
    public int discount;
    public int quantity;
    public String imageUrl;
    
    public Product() { }
    
    public Product(String name, String description, String category, int price, int discount) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.discount = discount;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
    public String toString() {
        return String.format("Product[id=%s, name='%s', category='%s']",id, name, category);
    }
}
