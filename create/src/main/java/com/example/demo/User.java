package com.example.demo;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="user")

public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

@NotNull //(message = "id cannot be null") // validation
private int id;  // 
@Column
@NotNull
// @NotBlank(message = "Category name cannot be blank")  // validation
private String name;
@Column

// @Size(min = 2, max = 50, message = "Brand name must be between 2 and 50 characters") // validation
private String address;
@Column
private int pincode;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}
