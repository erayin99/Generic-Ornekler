package Generik2;

public abstract class Kisi {
    private String adi;
    private String Soyad;
    private int dogumyili;

    public Kisi(){

    }

    public Kisi(String adi, String soyad, int dogumyili) {
        this.adi = adi;
        Soyad = soyad;
        this.dogumyili = dogumyili;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getDogumyili() {
        return dogumyili;
    }

    public void setDogumyili(int dogumyili) {
        this.dogumyili = dogumyili;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adi='" + adi + '\'' +
                ", Soyad='" + Soyad + '\'' +
                ", dogumyili=" + dogumyili +
                '}';
    }
}
