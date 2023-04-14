package com.example.sale.adapters.in.controller;

import com.example.sale.adapters.in.controller.mapper.SaleRequestMapper;
import com.example.sale.adapters.in.controller.request.SaleRequest;
import com.example.sale.application.ports.in.CreateSaleInputPort;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/v1/sales")
@RequiredArgsConstructor
public class SaleController {
    private final CreateSaleInputPort createSaleInputPort;

    private final SaleRequestMapper saleRequestMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSale(@RequestBody @Valid final SaleRequest saleRequest) {
        log.info("Criando a venda...");
        this.createSaleInputPort.create(this.saleRequestMapper.toSale(saleRequest));
        log.info("Venda criada com sucesso...");
    }
}
