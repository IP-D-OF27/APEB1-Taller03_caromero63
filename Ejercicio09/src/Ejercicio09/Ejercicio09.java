package Ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        //nombrar variabes
        int var1 = 81;
        int var2 = 25;
        int var3 = 10;
        int var4 = 50;
        System.out.println("El proceso para este problema es: ");
        //proceso
        double resultado1 = (Math.sqrt (var1) + Math.sqrt (var2))* var3;
        boolean resultadofinal = (resultado1 >= var4);
        System.out.println("Resultado de la primera expresión:" + resultado1);
        System.out.println("Por lo tanto el resultado de 140 >= 50 es: ");
        System.out.println(resultadofinal);
    }
    
}
