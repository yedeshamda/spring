package tn.esprit.hamda.Services;
import tn.esprit.hamda.entities.Stock;
import java.util.List;

public interface StockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
