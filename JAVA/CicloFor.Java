/* CICLO FOR*/

			int[] array = {2,3,5,7,1}; //Definimos el Array con cinco posiciones y sus respectivos enteros
			
			
			for (int i = 0; i < array.length ; i ++) {//Recorremos el Array incrementando una posición cada vez
			System.out.print(array[i] + ",");//Imprimimos en consola separando con una coma
			}
			System.out.println("Incrementamos en uno");
			for (int i = 0; i < array.length ; i ++) {//Incrementamos uno a cada entero dentro de su posicion en cada vuelta del ciclo
				array[i]++;
				}
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ",");//Devolvemos por consola el entero incrementado en uno
			}
