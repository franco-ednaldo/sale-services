package com.example.sale.adapters.in.controller.mapper;

import com.example.sale.adapters.in.controller.request.SaleRequest;
import com.example.sale.application.core.domain.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleRequestMapper {

    Sale toSale(SaleRequest request);
}
