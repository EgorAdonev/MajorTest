import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stocks",schema = "markets")
public class Stocks {
    @Id
    @Column(name = "corpid")
    private int corpid;
    @Column(name = "marketname")
    private String marketname;
    @Column(name = "traded_from_date")
    private java.sql.Date traded_from_date;
    @Column(name = "traded_to_date",nullable = true)
    private java.sql.Date traded_to_date;

    public Stocks() {}
    public Stocks(int corpid, String marketname, Date traded_from_date) {
        this.corpid = corpid;
        this.marketname = marketname;
        this.traded_from_date = traded_from_date;
    }

    public int getCorpid() {
        return corpid;
    }

    public void setCorpid(int corpid) {
        this.corpid = corpid;
    }

    public String getMarketname() {
        return marketname;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    public Date getTraded_from_date() {
        return traded_from_date;
    }

    public void setTraded_from_date(Date traded_from_date) {
        this.traded_from_date = traded_from_date;
    }

    public Date getTraded_to_date() {
        return traded_to_date;
    }

    public void setTraded_to_date(Date traded_to_date) {
        this.traded_to_date = traded_to_date;
    }
}
