package Generic3;

public class Kare {

    private double kenar;

    public Kare(){

    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public String toString() {
        return "Generic3.Kare{" +
                "kenar=" + kenar +
                '}';
    }
}
