package com.umlclass.diagram;

public class Order {
	 private Customer customer;
	    private Product product;
	    private int quantity;

	    public Order(Customer customer, Product product, int quantity) {
	        this.customer = customer;
	        this.product = product;
	        this.quantity = quantity;
	    }

		public final Customer getCustomer() {
			return customer;
		}

		public final void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public final Product getProduct() {
			return product;
		}

		public final void setProduct(Product product) {
			this.product = product;
		}

		public final int getQuantity() {
			return quantity;
		}

		public final void setQuantity(int quantity) {
			this.quantity = quantity;
		}

	   
}
