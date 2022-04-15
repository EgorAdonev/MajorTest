import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "stocks",schema = "markets")
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getcorpid() {
        return corpid;
    }

    public void setcorpid(int corpid) {
        this.corpid = corpid;
    }

    public String getmarketname() {
        return marketname;
    }

    public void setmarketname(String marketname) {
        this.marketname = marketname;
    }

    public Date gettraded_from_date() {
        return traded_from_date;
    }

    public void settraded_from_date(Date traded_from_date) {
        this.traded_from_date = traded_from_date;
    }

    public Date gettraded_to_date() {
        return traded_to_date;
    }

    public void settraded_to_date(Date traded_to_date) {
        this.traded_to_date = traded_to_date;
    }
}
