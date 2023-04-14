package com.example.sale.adapters.out.repoistory.entity;

import com.example.sale.application.core.domain.enums.SaleStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sales")
@Getter
@Setter
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer productId;

    private Integer userId;

    private BigDecimal value;

    private SaleStatus saleStatus;

    private Integer quantity;
}
