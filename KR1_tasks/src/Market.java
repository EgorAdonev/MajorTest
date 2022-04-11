import javax.persistence.*;

@Table
public class Market {
    private String marketName;
    private String currencyCode;

    public Market() {}
    public Market(String marketName, String currencyCode) {
       this.marketName = marketName;
       this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setId( int id ) {
        this.currencyCode = currencyCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName( String marketName ) {
        this.marketName = marketName;
    }
}
