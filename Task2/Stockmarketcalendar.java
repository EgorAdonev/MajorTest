import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stockmarketcalendar",schema = "markets")
public class Stockmarketcalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


}
