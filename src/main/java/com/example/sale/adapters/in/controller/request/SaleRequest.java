package com.example.sale.adapters.in.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleRequest {
    @NotNull
    private Integer userId;
    @NotNull
    private Integer productId;
    @NotNull
    private Integer quantity;
    @NotNull
    private BigDecimal value;
}
