package com.devsuperior.dsvendas.entities.builder;

import com.devsuperior.dsvendas.entities.Seller;

public final class SellerBuilder implements Builder<Seller> {

    private Seller seller = new Seller();

    private SellerBuilder() {
    }

    public static SellerBuilder aSeller() {
        return new SellerBuilder();
    }

    public SellerBuilder withId(Long id) {
        this.seller.setId(id);
        return this;
    }

    public SellerBuilder withName(String name) {
        this.seller.setName(name);
        return this;
    }

    @Override
    public Seller build() {
        return this.seller;
    }

}
