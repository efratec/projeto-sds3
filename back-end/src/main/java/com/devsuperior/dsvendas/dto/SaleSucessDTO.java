package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;
import java.math.BigDecimal;

public class SaleSucessDTO implements Serializable {

    private String sellerName;
    private Long visisted;
    private Long deals;

    public SaleSucessDTO(){
    }

    public SaleSucessDTO(Seller seller, Long visisted, Long deals) {
        this.sellerName = seller.getName();
        this.visisted = visisted;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisisted() {
        return visisted;
    }

    public void setVisisted(Long visisted) {
        this.visisted = visisted;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

}
