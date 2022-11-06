package Generic3;

public class DaireIslem implements Islemler<Daire>{
    @Override
    public double alanhesapla(Daire t) {

        double alan = t.getPI() * t.getYaricap() * t.getYaricap();

        return alan;

    }

    @Override
    public double cevrehesapla(Daire t) {

        double cevre = 2 * t.getPI() * t.getYaricap();


        return cevre;

    }
}
