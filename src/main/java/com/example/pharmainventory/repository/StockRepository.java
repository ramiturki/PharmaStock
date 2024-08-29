package com.example.pharmainventory.repository;

import com.example.pharmainventory.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}