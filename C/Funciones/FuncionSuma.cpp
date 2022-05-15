#include <stdio.h>
#include <conio.h>

	int suma();//Definición de la función
	int main(){
		
		printf("%i", suma());//Ejecución en el cuerpo principal del programa

	return 0;		
}

	int suma(){
		int num1 =12;//Definicion de variable local
		int num2=4;//Cuerpo de la función
		int suma = num1+num2;//Solución trivial
		return suma;//Condición de corte
	}	
