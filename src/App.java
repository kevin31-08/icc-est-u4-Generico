import java.util.ArrayList;

import moldes.Caja;
import moldes.Par;

public class App {
    public static void main(String[] args) throws Exception {
        
        Caja<String> pa = new Caja<>("Hola mundo");
        Caja<Integer> num1 = new Caja<>(100);
        Caja<Double> c1 = new Caja<>(9.75);
        Caja<Boolean> c2 = new Caja<>(false);

        System.out.println("=== PRACTICA GENERICOS ===");


        System.out.println("--- Uso de Caja<T> ---");
        System.out.println("caja de texto: " + pa);
        System.out.println("caja de entero:"+ num1);
        System.out.println("caja decimal: "+ c1);
        System.out.println("¿La caja de texto está vacía?:"+ c2);

        Par<Integer , String> c1 = new Par<>(1, "Juan Perez");
        
        Par<String, Double> c3 = new Par<>("Promedio", 8.75);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
    }
}
