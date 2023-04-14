package com.example.sale.adapters.out;

import com.example.sale.adapters.out.message.SaleMessage;
import com.example.sale.application.core.domain.Sale;
import com.example.sale.application.core.domain.enums.SaleEvent;
import com.example.sale.application.ports.out.SendCreatedSaleOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendCreatedSaleAdapter implements SendCreatedSaleOutputPort {
    private final KafkaTemplate<String, SaleMessage> kafkaTemplate;

    @Override
    public void send(Sale sale, SaleEvent event) {
        var saleMessage = new SaleMessage(sale, event);
        this.kafkaTemplate.send("tp-saga-sale", saleMessage);
    }
}
