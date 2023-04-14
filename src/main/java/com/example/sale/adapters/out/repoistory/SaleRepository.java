package com.example.sale.adapters.out.repoistory;

import com.example.sale.adapters.out.repoistory.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {
}
