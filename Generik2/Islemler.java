package Generik2;

import java.util.ArrayList;

public interface Islemler<T> {


    public boolean kaydet(T t);

    public boolean sil(T t);

    public void listele();

}
