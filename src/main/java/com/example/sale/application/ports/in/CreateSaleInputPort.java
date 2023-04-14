package com.example.sale.application.ports.in;

import com.example.sale.application.core.domain.Sale;

public interface CreateSaleInputPort {
    void create(Sale sale);
}
