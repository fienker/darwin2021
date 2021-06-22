package pe.edu.upeu.arreglos;

import java.util.Scanner;

/**
 * EjemploVectores
 */
public class EjemploVectores{

    public static void conceptovectores(){
        //definir vectores
        int[] vectorX;
        int []vectorY;
        //definir tamaño de vector
        vectorX = new int[2];
        vectorX[0] =20; //[0]indice de pocicon
        vectorX[1] =8; //[1]indice de pocion
        //vectorX[2] =5;
        System.out.println("Imprimir valores del vector");
        System.out.println(vectorX[0]);//imrprimiendo valor o elemto de l vector[0]
        //Asignanado valores directos a un vector
        int[] vA={12,2,3,4,5,6,7,8,9,10};
        int[] vB={12,2,3,4,5,6,7,8,9,10,45,16,32};
        //conoce el tamaño del vector
        System.out.println("Tamaño del vector vB="+vB.length);
    }
    //ejercios
    public static void mostrarValores  (int[] vector){
        for (int i = 0; i <vector.length; i++){
            System.out.println("v["+i+"]="+vector[i]+" Su indice es: "+i+" Su valor es :"+vector[i]);
        }
    }

    public static int[] rellenovector(int tv) {
        int[] vector=new int[tv];
        Scanner cs= new Scanner(System.in);
        for (int i=0; 1 < vector.length; i++){
            System.out.println("Ingrese el valor del indice"+i+":");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores (vector);
        return vector;
    }

    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        //conceptovectores();
        System.out.println("Ejercico 1");
        rellenovector(10);

    }
}