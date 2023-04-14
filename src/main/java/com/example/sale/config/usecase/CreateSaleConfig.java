package com.example.sale.config.usecase;

import com.example.sale.application.core.usecase.CreateSaleUseCase;
import com.example.sale.application.ports.out.SaveSaleOutputPort;
import com.example.sale.application.ports.out.SendCreatedSaleOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateSaleConfig {

    @Bean
    public CreateSaleUseCase createSaleUseCase(
            SaveSaleOutputPort saveSaleOutputPort,
            SendCreatedSaleOutputPort sendCreatedSaleOutputPort
    ) {
        return new CreateSaleUseCase(saveSaleOutputPort, sendCreatedSaleOutputPort);
    }

}
