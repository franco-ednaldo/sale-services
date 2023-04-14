package com.example.sale.application.ports.out;

import com.example.sale.application.core.domain.Sale;

public interface SaveSaleOutputPort {

    Sale save(Sale sale);
}
