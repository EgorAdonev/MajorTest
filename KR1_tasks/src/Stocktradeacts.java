import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stocktradeacts",schema = "markets")
public class Stocktradeacts {
    @Id
    @Column(name = "corpid")
    private int corpid;
    @Column(name = "marketname")
    private String marketName;
    @Column(name = "tradingdate")
    private java.sql.Date tradingdate;
    @Column(name = "open_price")
    private float open_price;
    @Column(name = "close_price")
    private float close_price;
    @Column(name = "lo_price")
    private float lo_price;
    @Column(name = "hi_price")
    private float hi_price;
    @Column(name = "trading_volume")
    private float trading_volume;

    public Stocktradeacts() {}
    public Stocktradeacts(int corpid,String marketName, Date tradingdate) {
        this.corpid = corpid;
        this.marketName = marketName;
        this.tradingdate = tradingdate;
    }

    public int getCorpid() {
        return corpid;
    }

    public void setCorpid(int corpid) {
        this.corpid = corpid;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Date getTradingdate() {
        return tradingdate;
    }

    public void setTradingdate(Date tradingdate) {
        this.tradingdate = tradingdate;
    }

    public float getOpen_price() {
        return open_price;
    }

    public void setOpen_price(float open_price) {
        this.open_price = open_price;
    }

    public float getClose_price() {
        return close_price;
    }

    public void setClose_price(float close_price) {
        this.close_price = close_price;
    }

    public float getLo_price() {
        return lo_price;
    }

    public void setLo_price(float lo_price) {
        this.lo_price = lo_price;
    }

    public float getHi_price() {
        return hi_price;
    }

    public void setHi_price(float hi_price) {
        this.hi_price = hi_price;
    }

    public float getTrading_volume() {
        return trading_volume;
    }

    public void setTrading_volume(float trading_volume) {
        this.trading_volume = trading_volume;
    }

}
