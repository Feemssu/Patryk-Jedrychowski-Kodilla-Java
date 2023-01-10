package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private Supplier supplier;
    private Product product;

    public OrderRequest(Supplier supplier, Product product){
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
