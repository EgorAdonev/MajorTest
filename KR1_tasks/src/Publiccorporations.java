import javax.persistence.*;


@Entity
@Table(name = "publiccorporations",schema = "markets")
public class Publiccorporations {
    @Id
    @Column(name = "corpid")
    @OneToMany(targetEntity = Stocktradeacts.class)
    private int corpId;

    private String corporationName;

    private String countryCode;

    public Publiccorporations() {}
    public Publiccorporations(String corporationName, String countryCode) {
        this.corporationName = corporationName;
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode( String countryCode ) {
        this.countryCode = countryCode;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName( String corporationName ) {
        this.corporationName = corporationName;
    }
}
