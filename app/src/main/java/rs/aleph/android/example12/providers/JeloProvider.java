package rs.aleph.android.example12.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.model.Category;
import rs.aleph.android.example12.model.Jelo;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class JeloProvider {
    public static List<Jelo> getFruits() {

        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "slano");





        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0,"spaghetti.jpg","spaghetti", "Spaghetti with bologneze sauce", 500.0f,250.00f,1.0f,c1));
        jela.add( new Jelo(1,"nuggat_cake.jpg", "Nugat Cake", "Cake with a lot of cream",400.0f, 350.00f,3.0f,c2));
        jela.add(new Jelo(2,"barbecue.png", "Barbecue", "Roasted a few types of meat.", 600.0f,740.35f,4.0f,c3));
        return jela;
    }

    public static List<String> getJeloNames() {

        List<String> names = new ArrayList<>();
        names.add("spaghetti");
        names.add("Nugat Cake");
        names.add("Barbecue");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "slano");

        switch (id) {
            case 0:
                return new Jelo(0,"spaghetti.jpg","spaghetti", "Spaghetti with bologneze sauce", 500.0f,250.00f,1.0f,c1);
            case 1:
                new Jelo(1,"nuggat_cake.jpg", "Nugat Cake", "Cake with a lot of cream",400.0f, 350.00f,3.0f,c2);
            case 2:
                new Jelo(2,"barbecue.png", "Barbecue", "Roasted a few types of meat.", 600.0f,740.35f,4.0f,c3);
            default:
                return null;
        }
    }
}



