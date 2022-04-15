import javax.persistence.*;

@Entity
@Table(name = "publiccorporations",schema = "markets")
public class Publiccorporations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "corpid",nullable = false)
    @OneToMany(targetEntity = Stocktradeacts.class)
    private int corpId;
    @Column(name = "corporationname",nullable = false)
    private String corporationName;
    @Column(name = "countrycode",nullable = true)
    private String countryCode;


    public Publiccorporations() {}
    public Publiccorporations(String corporationName, String countryCode) {
        this.corporationName = corporationName;
        this.countryCode = countryCode;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode( String countryCode ) {
        this.countryCode = countryCode;
    }

    public String getcorporationName() {
        return corporationName;
    }

    public void setcorporationName( String corporationName ) {
        this.corporationName = corporationName;
    }
}
