    		//PALABRAS BREAK & CONTINUE
    
		for( var contador = 0; contador < 3 ; contador++ ) {//Definimos la variable contador en la misma estructura iterativa ,su condicion de corte y el incremento
			if( contador % 2 == 0) { //Verificamos si el numero que iteramos es par
				System.out.println("contador =" + 	contador);
				break;//Mediante el break terminamos el ciclo por lo que se imprime 0
			}
			
			for( var contador = 0; contador < 3 ; contador++ ) {//Definimos la variable contador en la misma estructura iterativa ,su condicion de corte y el incremento
				if( contador % 2 != 0) { //Si el numero es impar
					continue; //Omite cualquier linea mas del ciclo for continuando a la siguiente iteracion
					
				}	
			System.out.println("contador =" + 	contador);
			}
	
	
		//ETIQUETAS O LABEL CONTINUE (PROGRAMACION "GO TO"-NO RECOMENDABLE-)
			/*inicio:
			for( var contador = 0; contador < 3 ; contador++ ) {//Definimos la variable en la misma estructura iterativa ,su condicion de corte y el incremento
			if( contador % 2 != 0) { //Si el numero es impar
				continue inicio; //Se indica al continue ir a la siguiente iteracion
				
			}	
			System.out.println("contador =" + 	contador);
			}*/
