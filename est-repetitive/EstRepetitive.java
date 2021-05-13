import java.util.Scanner;

/**
 * EstRepetitive hace comentario de un bloque de codigo
 */
//comentario una linea
public class EstRepetitive {
    //objteclado es un objeto
   static Scanner objteclado=new Scanner(System.in);//permite leer variable
   /* inicio a, b son atributos o variables, pero variables globales*/
    static int a=10;
    double b=5;
    /* fin a, b son atributos o variable globales*/
    /* estos son metodos*/


    public static void saludo(){
        System.out.println("Ingrese su nombre");
        String nombre=objteclado.next(); //leer nombre
        System.out.println("hola: "+nombre+" Como estas?");
        System.out.println("suma"+(a));
    }

    public void saludo2(){
        System.out.println("Ingrese su nombre");
        String nombre=objteclado.next(); //leer nombre
        System.out.println("hola: "+nombre+" Como estas?");
        System.out.println("suma"+ (a+b) )
    }

    public static void suma10Numeros(){
        //declarar Variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //datos de de entrada y procesos
        while(contador<=10){
            System.out.println("Ingrese el valor de la pocion"+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
        }
        System.out.println("La suma de los 10 numeros es"+sumaNumeros);

    }

    public static void suma10NumerosHacerMientras() {
        //Declarar Variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de entrada y Proceso
        do{        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;                        
        }
        while(contador<=10);
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }


    public static void suma10NumerosPara() {
        //Declarar Variables
        double numeros, sumaNumeros=0;        
        //Datos de entrada y Proceso
        for(int contador=1;contador<=10;contador++){        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;                                    
        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }    

    public static void main(String[] arg){
        // saludo();
       //suma10NumerosMientras() ;
       //suma10NumerosHacerMientras();
       suma10NumerosPara();
       /*EstRepetitive obj=new EstRepetitive();
       obj.saludo2();*/
    }
}