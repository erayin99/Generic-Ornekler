package Generic3;

public class Test {
    public static void main(String[] args) {

        Daire daire = new Daire(5.7);
        Kare kare = new Kare(5);
        DaireIslem daireislem = new DaireIslem();
        KareIslemler kareislem = new KareIslemler();
        double kalan = kareislem.alanhesapla(kare);
        double kcevre = kareislem.cevrehesapla(kare);
        double alan = daireislem.alanhesapla(daire);
        double cevre = daireislem.cevrehesapla(daire);
        System.out.println("alan : " + alan);
        System.out.println("cevre  : " + cevre);
        System.out.println("alan : " + kalan);
        System.out.println("cevre  : " + kcevre);

        hesapla(kare);
    }
    // generic metot
    public static<T> void hesapla(T t){
        System.out.println(t);
    }
}
