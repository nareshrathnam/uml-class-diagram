package com.umlclass.diagram;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<Order>();
    }

   

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List<Order> getOrders() {
		return orders;
	}



	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}



	public void placeOrder(Product product, int quantity) {
        Order order = new Order(this, product, quantity);
        orders.add(order);
    }

}
