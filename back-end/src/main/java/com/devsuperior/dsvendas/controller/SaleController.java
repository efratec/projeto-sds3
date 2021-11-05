package com.devsuperior.dsvendas.controller;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SaleService;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ok(saleService.findAll(pageable));
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ok(saleService.amountGroupedBySeller());
    }

    @GetMapping(value = "/sucess-by-seller")
    public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller() {
        return ok(saleService.sucessGroupedBySeller());
    }

}
