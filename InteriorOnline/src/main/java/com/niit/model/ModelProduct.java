package com.niit.model;
import javax.persistence.*;
@Entity
@Table(name = "PRODUCT")
public class ModelProduct {
	@Id @GeneratedValue
	@Column(name = "id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="category")
	String category;
	@Column(name="price")
	Double price;
	public int getId()
	{ 
		return id;
	}
	public void setId(int id)
	{ 
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCategory()
	{
		return name;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	}

