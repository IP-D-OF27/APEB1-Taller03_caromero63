package ejercicio01;
public class Ejercicio01 {
    public static void main(String[] args) {
              // TODO code application logic here
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 2;
        int var8 = 200;
        int var9 = 50;
        int var10 = 51;
        
        boolean resultado1 = ((var1 * var2) + var3 - (var4 / var5) + Math.pow(var5,var6) >= var8);
        boolean resultado2 = (var9 >= ( (var9 - var9) + var10));
        boolean resultado3 = resultado1 || resultado2;
        System.out.println("la respuesta es:" + resultado1);
        System.out.println("la respuesta es:" + resultado2);
        System.out.println("la respuesta  final es:" + resultado3);
        //System.out.println("La respuesta es:" + );
    }
}
