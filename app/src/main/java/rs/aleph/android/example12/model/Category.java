package rs.aleph.android.example12.model;

import java.util.ArrayList;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Category {
    private int id;
    private String naziv;
    private ArrayList<Jelo> jela;

    public Category() {
    }

    public Category(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Jelo> getJela() {
        return jela;
    }

    public void setJela(ArrayList<Jelo> jela) {
        this.jela = jela;
    }

    @Override
    public String toString() {
        return "Category{" +
                "naziv='" + naziv + '\'' +
                '}';
    }
}
