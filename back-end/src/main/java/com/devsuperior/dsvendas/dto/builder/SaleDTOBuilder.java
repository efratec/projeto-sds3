package com.devsuperior.dsvendas.dto.builder;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.builder.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

import static com.devsuperior.dsvendas.dto.builder.SellerDTOBuilder.getSellerDTOByEntity;

public final class SaleDTOBuilder implements Builder<SaleDTO> {

    private final SaleDTO saleDTO = new SaleDTO();

    private SaleDTOBuilder() {
    }

    public static SaleDTOBuilder aSaleDTO() {
        return new SaleDTOBuilder();
    }

    public SaleDTOBuilder withId(Long id) {
        this.saleDTO.setId(id);
        return this;
    }

    public SaleDTOBuilder withVisited(Integer visited) {
        this.saleDTO.setVisited(visited);
        return this;
    }

    public SaleDTOBuilder withDeals(Integer deals) {
        this.saleDTO.setDeals(deals);
        return this;
    }

    public SaleDTOBuilder withAmount(BigDecimal amount) {
        this.saleDTO.setAmount(amount);
        return this;
    }

    public SaleDTOBuilder withDate(LocalDate date) {
        this.saleDTO.setDate(date);
        return this;
    }

    public SaleDTOBuilder withSeller(SellerDTO seller) {
        this.saleDTO.setSeller(seller);
        return this;
    }

    public static SaleDTO getSaleDTOByEntity(Sale entity) {
        return aSaleDTO()
                .withId(entity.getId())
                .withVisited(entity.getVisited())
                .withDeals(entity.getDeals())
                .withAmount(entity.getAmount())
                .withDate(entity.getDate())
                .withSeller(getSellerDTOByEntity(entity.getSeller()))
                .build();
    }

    @Override
    public SaleDTO build() {
        return this.saleDTO;
    }

}
