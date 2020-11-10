package com.example.RetoIsabelMS.MODEL;

public class OrderProduct {
    private Order order;
    private Product product;
    private int quantity;
    private static int count=0;
    private int id; 

    //Constructor
    public OrderProduct(){

    }
    public OrderProduct(int _id,Order _order, Product _product, int _quantity){
        this.order = _order;
        this.product = _product;
        this.quantity = _quantity;
        this.id = count++;
    }


    public Order getOrder() {
        return order;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    

    public void setOrder(Order order) {
        this.order = order;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
