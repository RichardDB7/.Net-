#include <stdio.h>
#include <conio.h>

 int main(){
 	 
 	int matriz[3][3], fila, col; //Definimos la matriz con su respectivas dimensiones y las variables que colocarán el dato entero en cada una de las posiciones de las filas y las columnas
 	
 	for(fila=0;fila<3;fila++){//Con el primer ciclo for recorremos fila por fila y columna por columna colocando el dato entero correspondiente
 		for(col=0;col<3;col++){
 			printf("De la fila #%d , digite el valor #%d:",fila+1, col+1);
 			scanf("%d", &matriz[fila][col]);
 			}
 	    }
 	printf("\n\n");
 	for(fila=0;fila<3;fila++){//Con el segundo ciclo for recorremos las filas y columnas para devolver los datos por consola mediante printf
 		for(col=0;col<3;col++){
 			printf("%d ", matriz[fila][col]);
 		}
 	    printf("\n");
 	    
 	}
 	    
 	
 	
 	return 0;
 }
