#include<stdio.h>
#include<conio.h>


	int main(){
		
		char hola[]= "hola";//Definimos el array de tipo caracter con su dato correspondiente, sin definir posicion del mismo
		char chau[4]={'c','h','a','u'}; //Definimos el array con cuatro posiciones y el dato char en cada una de las mismas
		
			
			 
		for(int x=0;x<4;x++){//Recorremos el primer array mediante el ciclo for imprimiendo su contendio
			printf("El dato es %c\n", hola[x]);
		}
		
		for(int x=0;x<4;x++){
			printf("El dato es %c\n", chau[x]);
		}		
		
		return 0;
		
		
		
	}
