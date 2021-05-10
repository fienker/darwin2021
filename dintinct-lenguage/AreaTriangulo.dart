import "dart:io";
void main() {
//definir varibles u otros
print("Ejercio 01: Area Triangulo");
//datos de entrada
print("Ingrese base:");
var b=int.parse(stdin.readLineSync());
print("Ingrese altura:");
var h=int.parse(stdin.readLineSync());
//proceso
var area=(b*h)/2;
//salida
print("El area del triangulo es: $area");
}