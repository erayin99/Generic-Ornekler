package Generic;

public class Ogrenci extends Kisi{

    private String okulno;

    public Ogrenci(){

    }

    public Ogrenci(String okulno) {
        this.okulno = okulno;
    }

    public Ogrenci(String adi, String soyad, int dogumyili, String okulno) {
        super(adi, soyad, dogumyili);
        this.okulno = okulno;
    }

    public String getOkulno() {
        return okulno;
    }

    public void setOkulno(String okulno) {
        this.okulno = okulno;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + getAdi() + '\'' +
                "soyad='" + getSoyad() + '\'' +
                "dogumyili='" + getDogumyili() + '\'' +
                "okulno='" + okulno + '\'' +
                '}';
    }
}
