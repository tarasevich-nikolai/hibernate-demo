package tarasevich.nikolai.stock;

import java.io.Serializable;

/**
 * @author mikalai.u.tarasevich
 */
public class Stock implements Serializable {

    private Integer stockId;
    private String stockName;
    private String stockCode;
    private StockDetail stockDetail;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }
}
