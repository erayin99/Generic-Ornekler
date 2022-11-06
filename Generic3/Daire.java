package Generic3;

public class Daire {

    private double yaricap;

    private final double PI = 3.14;

    public Daire(){

    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "Generic3.Daire{" +
                "yaricap=" + yaricap +
                ", PI=" + PI +
                '}';
    }
}
