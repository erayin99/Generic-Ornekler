package Generic3;

public class KareIslemler implements Islemler<Kare>{
    @Override
    public double alanhesapla(Kare t) {
        double alan = t.getKenar()*t.getKenar();
        return alan;

    }

    @Override
    public double cevrehesapla(Kare t) {

        return 4*t.getKenar();
    }
}
