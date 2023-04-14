package com.example.sale.adapters.out.message;

import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.core.domain.enums.SaleEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleMessage {
    private Sale sale;

    private SaleEvent event;
}
