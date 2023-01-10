package com.kodilla.good.patterns.challenges.food2door;

public class Supplier implements SupplierService {

    private String supplierName;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }


    @Override
    public boolean process(Supplier supplier, Product product) {

        System.out.println("Your order:" + product.getProductQuantity() + "* " +  product.getProductName() +  " from shop: " +
                getSupplierName() + " has been completed. Total value is: " + (product.getProductPrize()* product.getProductQuantity())  + " złoty.");
        return true;
    }

}
