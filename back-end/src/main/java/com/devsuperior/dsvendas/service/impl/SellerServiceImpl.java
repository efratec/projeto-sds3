package com.devsuperior.dsvendas.service.impl;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        return sellerRepository.findAll().stream().map(SellerDTO::new).collect(Collectors.toList());
    }

}
