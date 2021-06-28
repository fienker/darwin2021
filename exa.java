import java.util.*;
public class exa{

    public static void main(String[] args) {
 
        Scanner var = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");                                                         
        n = var.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=20; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }

    public static int Numero_elevado(int x, int z) {

        int resultado = 1;

        for (int i = 1; i <= z; i++) {

            resultado = resultado * x;

        }

        return resultado;

    }
}