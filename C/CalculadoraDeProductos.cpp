#include<stdio.h>
#include<conio.h>

	int main(){
		
		int cantidadVendida[10]; //Inicio de arrays y variables
		int totalVendido[10];
		int codProducto=0;
		int importe=0;
		
		int i=0;
		for(i=0; i<10;i++){//Inicio de Arrays
			cantidadVendida[i]=0;
			totalVendido[i]=0;
			
		}
		
	printf("Ingrese código de producto:");
	scanf("%d", &codProducto);
	while(codProducto != 0){ //El ciclo while se repetirá mientras no se ingrese el numero 0
		printf("Ingrese importe de la venta:");
		scanf("%d", &importe);		
		
		cantidadVendida[codProducto]++; //suma de uno a la cantidad vendida
		totalVendido[codProducto] = importe; //acumulo el total vendido
		
		printf("Ingrese código de producto: ");
		scanf("%d", &codProducto);
		
	}
		
		
	for(i=0;i<10;i++){//Mediante el ciclo for recorremos los productos cargados y devolvemos la cantidad vendida y el importe
		printf("Para el producto %d se vendieron %d unidades por un total de %d\n", cantidadVendida[i], totalVendido[i]);
		
	}	
		
	return 0;
	}
