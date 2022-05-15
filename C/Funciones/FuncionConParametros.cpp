#include <stdio.h>
#include <conio.h>

	int suma(int num1, int num2); //Definimos el tipo de funcion
	
	int suma(int num1,int num2){//Funcion
		
	    int suma = num1 + num2;//Solucion trivial
		  return suma;//Corte
	}	

	
	int main(){
		
		int num1,num2,resultado; //Definimos Variables
		printf("Ingresa el primer valor\n");
		scanf("%i", &num1);
		printf("Ingresa el segundo valor\n");
		scanf("%i", &num2);
		resultado = suma(num1,num2); //Alojamos la funcion en la variable previamente definida
		
		
		printf("El resultado es: %i\n", resultado); //Devolvemos el resultado
		
		
	
	return 0;		
}
	
