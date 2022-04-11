import javax.persistence.*;
@Entity
@Table(name = "stockmarketcalendar",schema = "markets")
public class Stockmarketcalendar {
    @Id
    @OneToMany
    @Column(name = "marketname")
    private String marketName;
    @Id
    @Column(name = "tradingdate")
    private java.sql.Date tradingdate;
}
