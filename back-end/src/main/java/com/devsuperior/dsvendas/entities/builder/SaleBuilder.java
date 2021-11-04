package com.devsuperior.dsvendas.entities.builder;

import com.devsuperior.dsvendas.entities.Sale;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class SaleBuilder implements Builder<Sale> {

    private Sale sale = new Sale();

    private SaleBuilder() {
    }

    public static SaleBuilder aSale() {
        return new SaleBuilder();
    }

    public SaleBuilder withId(Long id) {
        this.sale.setId(id);
        return this;
    }

    public SaleBuilder withVisited(Integer visited) {
        this.sale.setVisited(visited);
        return this;
    }

    public SaleBuilder withDeals(Integer deals) {
        this.sale.setDeals(deals);
        return this;
    }

    public SaleBuilder withAmount(BigDecimal amount) {
        this.sale.setAmount(amount);
        return this;
    }

    public SaleBuilder withDate(LocalDate date) {
        this.sale.setDate(date);
        return this;
    }

    @Override
    public Sale build() {
        return this.sale;
    }

}
