package com.aptosstbbq.bbqapp.menu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuItem {
	
	private String name = "Unnamed Menu Item";
	private String description = "No Description";
	private String category = null;
	private List<String> ingredients = new ArrayList<>();
	private List<InterchangableIngredient> interchangableIngredients = new ArrayList<>();
	private BigDecimal price = new BigDecimal("-1");
	
	public MenuItem(String name, BigDecimal price, String... ings) {
		setName(name);
		setPrice(price);
		for (String ing : ings) {
			addIngredient(ing);
		}
	}
	
	public MenuItem(String name, String price, String... args) {
		this (name, new BigDecimal(price), args);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addIngredient(String ing) {
		if (!ingredients.contains(ing)){
			ingredients.add(ing);
		}
	}
	
	public void addInterchangableIngredient(InterchangableIngredient ing) {
		if (!interchangableIngredients.contains(ing)){
			interchangableIngredients.add(ing);
		}
	}
	
	public List<String> getIngredients() {
		return Collections.unmodifiableList(ingredients);
	}

	public List<InterchangableIngredient> getInterchangableIngredients() {
		return Collections.unmodifiableList(interchangableIngredients);
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setPrice(String price) {
		this.price = new BigDecimal(price);
	}
}
