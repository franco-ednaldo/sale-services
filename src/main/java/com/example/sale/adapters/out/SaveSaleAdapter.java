package com.example.sale.adapters.out;

import com.example.sale.adapters.out.repoistory.SaleRepository;
import com.example.sale.adapters.out.repoistory.mapper.SaleMapper;
import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.ports.out.SaveSaleOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveSaleAdapter implements SaveSaleOutputPort {

    private final SaleRepository saleRepository;

    private final SaleMapper saleMapper;

    @Override
    public Sale save(Sale sale) {
        var saleEntity = this.saleMapper.toSaleEntity(sale);
        var saleResponse = this.saleRepository.save(saleEntity);
        return this.saleMapper.toSale(saleResponse);
    }

}
