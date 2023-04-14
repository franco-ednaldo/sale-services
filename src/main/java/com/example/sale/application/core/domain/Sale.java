package com.example.sale.application.core.domain;

import com.example.sale.application.core.domain.enums.SaleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    private Integer id;

    private Integer productId;

    private Integer userId;

    private BigDecimal value;

   private SaleStatus saleStatus;

    private Integer quantity;


}
