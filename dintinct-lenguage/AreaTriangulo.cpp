#include <iostream>
int main () {
  //definir valotres
  printf("Ejercicio 01: Area de un Triangulo\n");
  int b=0, h=0, area=0;
  //datos de entarda
  printf("Ingrese base:");
  scanf("%i", &b);
  printf("Ingrese altura");
  scanf("%i", &h);
  //proceso
  area=(b*h)/2;
  //dartos de ssalida
  printf("Area de triangulo es:%i %s", area, "\n");
  return 0;
}