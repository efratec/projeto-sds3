package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;
import java.math.BigDecimal;

public class SaleSumDTO implements Serializable {

    private String sellerName;
    private BigDecimal sum;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, BigDecimal sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

}
