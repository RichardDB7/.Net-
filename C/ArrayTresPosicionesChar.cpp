#include<stdio.h>
#include<conio.h>

	int main(){
		
		char* nombres[3]; // Defino array de tres posiciones
		
		nombres[0]="luis"; //Dato de la posición cero
		nombres[1]="ana"; //Dato de la posición uno
		nombres[2]="berta"; //Dato de la posición dos
		
		for(int x=0; x<3; x++){ //Mediante el ciclo for recorremos las posiciones del array e imprimimos el nombre alojado en cada posición del array
			printf("El dato es %s\n", nombres[x]); 
			
		} 
		
		return 0;
		
		
		
	}
