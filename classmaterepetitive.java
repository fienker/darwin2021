
import java.util.Scanner;
public class classmaterepetitive {
    static Scanner teclado=new Scanner(System.in);
    public static void contadordenumero() {
        int contador=1;
        while (contador<=15) {
            System.out.println("hola");
            contador++;
        }
    }

    public static void sumadereales() {
        int suma=0;
        for (int i=0; i<101; i++){
            System.out.println(suma+"+"+i);
            suma=suma+i;
            System.out.println("suma de reales " + suma);
        }

    }

    public static void main(String[] args) {
        //contadordenumero();
        sumadereales();
    }
    
}
