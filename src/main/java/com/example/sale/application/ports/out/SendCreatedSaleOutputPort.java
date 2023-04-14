package com.example.sale.application.ports.out;

import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutputPort {
    void send(Sale sale, SaleEvent event);
}
