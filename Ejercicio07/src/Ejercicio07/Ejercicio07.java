package Ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        //nombrar variables
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        System.out.println("La solución del problema es: ");
        //proceso
        double resexp1 = ((Math.sqrt(var1) + var2) / var3);
        boolean resultado1 =  ( resexp1 == var2);
        boolean resultado2 = (var4 > var5);
        double resexp2 = (var6 / var7);
        double rester1 = Math.sqrt(var6);
        boolean resultado3 = resexp2 >= rester1;
        boolean resultadofinal = resultado1 || resultado2 && resultado3; 
        //salida
        System.out.println("Resultado de la primera expresion: " + resexp1);
        System.out.println("Vemos que 6==9 es: " + resultado1);
        System.out.println("En la segunda expresión tenemos 10>1, que es: " + resultado2);
        System.out.println("Y para la ultima expresion de dividisión, su respuesta da: " + resexp2);
        System.out.println("Con la raiz cuadrada de 100 da: " + rester1);
        System.out.println("Finalmente se combrueba si 4>=10, y da como resultado final: ");
        System.out.println(resultadofinal);
    }
    
}
