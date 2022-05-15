#include <stdio.h>
#include <conio.h>

	int main(){
		
		int casos; //Se define la variable entera que permitirá seleccionar
		printf("Ingresa un numero de legajo\n");
		scanf("%i", &casos);
		
		switch(casos){//Mediante la estructura selectiva switch digitamos la opcion correspondiente 
			
			case 1:
			printf("Elegiste el primer caso\n");
			break;
			
			case 2:
			printf("Elegiste el segundo caso\n");	
			break;
			
			case 3:
			printf("Elegiste el tercer caso\n");	
			break;
			
			case 4:
			printf("Elegiste el cuarto caso\n");	
			break;
			
			case 5:
			printf("Elegiste el quinto caso\n");
			break;
			
			default:
			printf("No encontramos tu caso\n");
			break;
		}
		
		
		
		
		
		return 0;
	}
