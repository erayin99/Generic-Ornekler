package Generik2;

import java.util.ArrayList;

public class OgrenciIslem implements Islemler<Ogrenci>{

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();


    @Override
    public boolean kaydet(Ogrenci t) {
        boolean durum = ogrenciler.add(t);
        return true;
    }

    @Override
    public boolean sil(Ogrenci ogrenci) {
        return false;
    }

    @Override
    public void listele() {

    }
}
