package Generic4;

public class Main {
    public static  void main(String[] args) {
        Basit<Integer> gb = new Basit<>(10);
        System.out.println(gb.getT());

        Basit<String> gbs = new Basit<>("ON");
        System.out.println(gbs.getT());
    }
}
