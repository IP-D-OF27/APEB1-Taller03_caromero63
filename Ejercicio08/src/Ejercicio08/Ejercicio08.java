package Ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        //nombrar variables
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        System.out.println("La solución del problema es: ");
        //proceso
        double resexp1 = (var1 * var2) + var3 - (var4/var5) + Math.pow (var6,var5);
        boolean resultado1 = (resexp1 >= var7);
        boolean resultado2= (var8 >=var8 - var8 + var9);
        boolean resultadofinal = resultado1 || resultado2;
        //salida
        System.out.println("El resultado de resolver el primer termino da: " + resexp1);
        System.out.println("Y viendo que -131 >= 200 da: " + resultado1);
        System.out.println("En el segundo término vemos que 50>=51 da: " + resultado2);
        System.out.println("Finalmente se tiene false || false, que tiene como resultado final del ejercicio:");
        System.out.println(resultadofinal);
    }
    
}
