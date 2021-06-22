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
}