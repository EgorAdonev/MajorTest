import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stockmarketcalendar",schema = "markets")
public class Stockmarketcalendar {
    @Id
    @ManyToOne
    @Column(name = "marketname",nullable = false)
    private String marketName;
    @Id
    @Column(name = "tradingdate",nullable = false)
    private java.sql.Date tradingdate;

    public Stockmarketcalendar(){}
    public Stockmarketcalendar(String marketName, Date tradingdate) {
        this.marketName = marketName;
        this.tradingdate = tradingdate;
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


}
