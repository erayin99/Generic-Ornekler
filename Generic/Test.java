package Generic;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen("Ferhat", "Aslan", 1975, "Matematik" );

        Ogretmen ogretmen2 = new Ogretmen("Erdal", "Ayin", 1985, "Fen");

        Ogretmen ogretmen3 = new Ogretmen("Aziz", "Ayin", 1984, "Edebiyat");

        Ogrenci ogrenci1 = new Ogrenci("Furkna", "Gocmen", 2002, "123");
        ogrenci1.setOkulno("123");
        Ogrenci ogrenci2 = new Ogrenci("Kerem", "Ayin", 2008, "124");
        Islemler<Ogretmen> islem = new Islemler<Ogretmen>();
        islem.kaydet(ogretmen3);
        islem.kaydet(ogretmen2);
        islem.kaydet(ogretmen1);
        //islem.listele(); // class icerisinde listeledik
        ArrayList<Ogretmen> ogretmenler = islem.getListe();
        for(Ogretmen ogretmen : ogretmenler){ // clasta araylist olarak olusturdugumus liste
            System.out.println(ogretmen.getAdi() + " " + ogretmen.getSoyad());
        }

        Islemler<Ogrenci> islem1 = new Islemler<Ogrenci>();
        islem1.kaydet(ogrenci1);
        islem1.kaydet(ogrenci2);
        islem1.listele();
    }
}
