package tn.esprit.hamda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamda.Repository.StockRepository;
import tn.esprit.hamda.entities.Stock;

import java.util.List;

@Service
public class IStockServiceIMP implements StockService{
@Autowired
    StockRepository stockRepository;
@Override
    public List<Stock> retrieveAllStocks() {
    return  stockRepository.findAll();
    }
    @Override
    public Stock addStock(Stock s){
    return stockRepository.save(s);
    }
@Override
    public Stock updateStock(Stock u)
    {
        return stockRepository.save(u);
    }
@Override
    public Stock retrieveStock(Long id)
    {
        return stockRepository.findById(id).orElse(null);
    }

}
