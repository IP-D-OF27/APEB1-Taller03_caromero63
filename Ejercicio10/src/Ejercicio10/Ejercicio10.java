package Ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        //nombramos variables (entrada)
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5;
        int var6 = 2;
        System.out.println("El proceso para este problema es: ");
        //proceso
        double resultado1 = (Math.sqrt (var1) * var2);
        boolean resexp1 = (resultado1 >= var3);
        boolean resexp2 = (true) || (false);
        double resultado2 = (var4 / var5);
        boolean resexp3 = (resultado2 >= var6);
        boolean resultadofinal = (resexp1 && resexp2 || resexp3);
        //salida
        System.out.println("Resultado de la primera operación: " + resultado1);
        System.out.println("Por lo tanto 50>=100 es: " + resexp1);
        System.out.println("Ahora en la segunda expresión tenemos true || false, que nos da: " + resexp2);
        System.out.println("Y por ultimo en la tercera expresión tenemos que 2>=2, que es:" + resexp3);
        System.out.println("Teniendo ahora 3 valores lógicos: false && true || true ;damos primero prioridad al operador (&&). false && true nos da: false ;ahora entre false || true nos da el resultado final de este ejercicio que es: ");
        System.out.println(resultadofinal);
                
    }
}
