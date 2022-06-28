#include <conio.h>
#include <stdio.h>
	int main (){
		
		int x, casillero[5]; //Definimos la variable que utilizaremos como contador y el array con cinco posiciones
		
		for(x=0;x<5;x++){ //Mediante el ciclo for recorremos el array ingresando las notas en cada posición hasta que llegue a la quinta
			printf("Digite nota: ");
		scanf("%d", &casillero[x]);
		}
		for(x=0;x<5;x++){
			printf("\nLa nota es: %d", casillero[x]);//Mediante el ciclo for recorremos nuevamente cada uno de las posiciones y mostramos el dato que contiene
		}
		
		
		return 0;
		getch();
	}
