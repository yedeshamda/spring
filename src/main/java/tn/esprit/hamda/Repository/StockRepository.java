package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.hamda.entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
