import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stocktradeacts",schema = "markets")
public class Stocktradeacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getcorpid() {
        return corpid;
    }

    public void setcorpid(int corpid) {
        this.corpid = corpid;
    }

    public String getmarketName() {
        return marketName;
    }

    public void setmarketName(String marketName) {
        this.marketName = marketName;
    }

    public Date gettradingdate() {
        return tradingdate;
    }

    public void settradingdate(Date tradingdate) {
        this.tradingdate = tradingdate;
    }

    public float getopen_price() {
        return open_price;
    }

    public void setopen_price(float open_price) {
        this.open_price = open_price;
    }

    public float getclose_price() {
        return close_price;
    }

    public void setclose_price(float close_price) {
        this.close_price = close_price;
    }

    public float getlo_price() {
        return lo_price;
    }

    public void setlo_price(float lo_price) {
        this.lo_price = lo_price;
    }

    public float gethi_price() {
        return hi_price;
    }

    public void sethi_price(float hi_price) {
        this.hi_price = hi_price;
    }

    public float gettrading_volume() {
        return trading_volume;
    }

    public void settrading_volume(float trading_volume) {
        this.trading_volume = trading_volume;
    }

}
