package Generik2;

import Generic.Kisi;

public class Ogretmen extends Kisi {

    private String brans;

    public Ogretmen(){

    }

    public Ogretmen(String brans) {
        this.brans = brans;
    }

    public Ogretmen(String adi, String soyad, int dogumyili, String brans) {
        super(adi, soyad, dogumyili);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adi='" + getAdi() + '\'' +
                "soyad='" + getSoyad() + '\'' +
                "dogumyili='" + getDogumyili() + '\'' +
                "brans='" + brans + '\'' +
                '}';
    }
}
