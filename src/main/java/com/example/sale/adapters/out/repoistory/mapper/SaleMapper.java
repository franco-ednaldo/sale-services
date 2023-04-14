package com.example.sale.adapters.out.repoistory.mapper;

import com.example.sale.adapters.out.repoistory.entity.SaleEntity;
import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.core.domain.enums.SaleStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface SaleMapper {

    @Mapping(source = "status", target = "statusId", qualifiedByName = "setStatusId")
    SaleEntity toSaleEntity(Sale sale);


    @Mapping(target = "status", source = "statusId", qualifiedByName = "setStatus")
    Sale toSale(SaleEntity saleEntity);

    @Named("setStatusId")
    default Integer setStatusId(final SaleStatus status) {
        return status.getStatusId();
    }

    @Named("setStatus")
    default SaleStatus setStatus(final Integer statusId) {
        return SaleStatus.toEnum(statusId);
    }
}
