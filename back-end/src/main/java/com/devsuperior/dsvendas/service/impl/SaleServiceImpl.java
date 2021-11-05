package com.devsuperior.dsvendas.service.impl;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.dto.builder.SaleDTOBuilder;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll(); // A solution for small cases - save all sellers to spring boot cache
        return saleRepository.findAll(pageable).map(SaleDTOBuilder::getSaleDTOByEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller() {
        return saleRepository.sucessGroupedBySeller();
    }
}
