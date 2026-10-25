package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // nombrar variables 
        int var1 = 10;
        int var2 = 2;
        int var3 = 16;
        int var4 = 20;
        int var5 = 1;
        int var6 = 11;
        System.out.println("La solución del problema es: ");
        //proceso
        //aquí se pone (double) antes de var4 para que java lo detecte temporalmente como 20.0 y se force una división decimal.
        double resultado = Math.pow(var1,var2) + Math.sqrt(var3) + (double) var4 / (var5 + var6);
        //salida
        System.out.println(resultado);
    }
    
}
