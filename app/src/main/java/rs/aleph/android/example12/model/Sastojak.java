package rs.aleph.android.example12.model;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Sastojak {
    private String naziv;
    private float kolicina;
    private Jelo jelo;

    public Sastojak() {
    }

    public Sastojak(String naziv, float kolicina) {
        this.naziv = naziv;
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Sastojak{" +
                "naziv='" + naziv + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
