package Ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        //nombrar variables
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        System.out.println("La solución del problema es: ");
        //proceso
        double resoper1 = ((Math.sqrt(var1)) + var2) / var3;
        boolean resultado = (resoper1 == var2);
        boolean resoper2 = (var4 > var5);
        //salida
        System.out.println("Resultado de la primera operación: " + resoper1);
        System.out.println("Ahora comprobamos que 6==9 es: " + resultado);
        System.out.println("En la segunda operacion se encuentra que 10 > 1, que vendria a ser: " + resoper2);
        System.out.println("Y como resultado final tenemos a los valores logicos false $$ true que nos da como resultado final al ejercicio: ");
        System.out.println(resultado);
    }
    
}
