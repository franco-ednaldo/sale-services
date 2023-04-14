package com.example.sale.application.core.usecase;

import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.core.domain.enums.SaleEvent;
import com.example.sale.application.core.domain.enums.SaleStatus;
import com.example.sale.application.ports.in.CreateSaleInputPort;
import com.example.sale.application.ports.out.SaveSaleOutputPort;
import com.example.sale.application.ports.out.SendCreatedSaleOutputPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateSaleUseCase implements CreateSaleInputPort {
    private final SaveSaleOutputPort saveSaleOutputPort;

    private final SendCreatedSaleOutputPort sendCreatedSaleOutputPort;

    @Override
    public void create(final Sale sale) {
        sale.setSaleStatus(SaleStatus.PENDING);
        var saleResponse = this.saveSaleOutputPort.save(sale);
        this.sendCreatedSaleOutputPort.send(saleResponse, SaleEvent.CREATED_SALE);
    }
}
