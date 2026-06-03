


import moldes.Caja;
import moldes.Par;

public class App { 
    public static void main(String[] args) throws Exception {
       Caja<String> stringCaja = new Caja<>();
       Caja<Integer> integerCaja = new Caja<>();
       Caja<Double> doubleCaja = new Caja<>();
       Caja<Boolean> booleanCaja = new Caja<>();

       stringCaja.setT("Hola mundo");
       integerCaja.setT(80);
       doubleCaja.setT(10.5);
       booleanCaja.setT(false);

       Par<Integer,String> datosPar = new Par<>();
       Par<String,Integer> datosPar2 = new Par<>();
       Par<String,Double> datosPar3 = new Par<>();

       datosPar.setK(1);
       datosPar.setV("Evelyn Perez");
       datosPar2.setK("Edad");
       datosPar2.setV(21);
       datosPar3.setK("Promedio");
       datosPar3.setV(9.4);
       System.out.println("-----Uso de Caja<T>-----");
       System.out.println("Caja de texto : " + stringCaja.getT());
       System.out.println("Caja de entero : " + integerCaja.getT());
       System.out.println("Caja de decimal : " + doubleCaja.getT());
       System.out.println("¿ La caja de texto esta vacia: ? " + booleanCaja.getT());
       System.out.println();

       System.out.println("-----Uso de Par<K, V>-----");
       System.out.println("Clave : " + datosPar.getK()+ " | " + "Valor: " + datosPar.getV());
       System.out.println("Clave : " + datosPar2.getK()+ " | " + "Valor: " + datosPar2.getV());
       System.out.println("Clave : " + datosPar3.getK()+ " | " + "Valor: " + datosPar3.getV());



    }
}