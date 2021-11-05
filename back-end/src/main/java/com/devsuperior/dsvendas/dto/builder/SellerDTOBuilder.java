package com.devsuperior.dsvendas.dto.builder;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.entities.builder.Builder;

public final class SellerDTOBuilder implements Builder<SellerDTO> {

    private final SellerDTO sellerDTO = new SellerDTO();

    private SellerDTOBuilder() {
    }

    public static SellerDTOBuilder aSellerDTO() {
        return new SellerDTOBuilder();
    }

    public SellerDTOBuilder withId(Long id) {
        this.sellerDTO.setId(id);
        return this;
    }

    public SellerDTOBuilder withName(String name) {
        this.sellerDTO.setName(name);
        return this;
    }

    public static SellerDTO getSellerDTOByEntity(Seller seller) {
        return aSellerDTO()
                .withId(seller.getId())
                .withName(seller.getName())
                .build();
    }

    @Override
    public SellerDTO build() {
        return this.sellerDTO;
    }

}
