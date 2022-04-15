import javax.persistence.*;

@Entity
@Table(name = "market",schema = "markets")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marketname",nullable = false)
    private String marketName;
    @Column(name = "currencycode")
    private String currencyCode;

    public Market() {}
    public Market(String marketName, String currencyCode) {
       this.marketName = marketName;
       this.currencyCode = currencyCode;
    }

    public void setcurrencyCode() {this.currencyCode = currencyCode;}

    public String getcurrencyCode() {
        return currencyCode;
    }

    public void setmarketName( String marketName ) {
        this.marketName = marketName;
    }

    public String getmarketName() {
        return marketName;
    }

}
