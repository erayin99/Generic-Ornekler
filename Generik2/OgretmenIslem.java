package Generik2;

import java.util.ArrayList;

public class OgretmenIslem implements Islemler<Ogretmen>{

    private ArrayList<Ogretmen> ogretmenler = new ArrayList<>();


    @Override
    public boolean kaydet(Ogretmen t) {
        boolean durum = ogretmenler.add(t);

        return true;
    }

    @Override
    public boolean sil(Ogretmen t) {
        return false;
    }

    @Override
    public void listele() {

    }
}
