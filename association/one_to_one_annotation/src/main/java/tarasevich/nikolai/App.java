package tarasevich.nikolai;

import org.hibernate.Session;
import tarasevich.nikolai.stock.Stock;
import tarasevich.nikolai.stock.StockDetail;
import tarasevich.nikolai.util.HibernateUtil;

import java.util.Date;

/**
 * @author mikalai.u.tarasevich
 */
public class App {

    public static void main(String args[]) {
        System.out.println("Hibernate one to one (XML mappings)");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("4715");
        stock.setStockName("GENM");

        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("GENTING Malaysia");
        stockDetail.setCompDesc("Best resort in the world");
        stockDetail.setRemark("Nothing Special");
        stockDetail.setListedDate(new Date());

        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);

        session.save(stock);
        session.getTransaction().commit();

        System.out.println("Done");
    }
}
