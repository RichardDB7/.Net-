/*Realizar un programa que permita leer de teclado cinco valores reales entre 100 y -200;
 * Luego realizar el siguiente cálculo resultado = ((valor1 * valor2) – (valor3 * valor4)) / valor5; 
 * y por último imprimir en pantalla el resultado.*/


public class Ejercicio1 {
	

	
		public static void main(String[] args) {
			
			int val1, val2, val3,val4, val5,resultado; //Defino variables generales
			
			int max = 100;//Variables para utilizar como condicion
			int min = -200;
			
			Scanner dato = new Scanner(System.in); //Ingreso de datos mediante la clase Scanner
			
			System.out.println("Ingrese numeros entre -200 y 100");
			
			System.out.println("El primer Valor se multiplicara por el segundo\n");
			System.out.println("Ingrese el primer Valor :\n");
			val1 = dato.nextInt();
			System.out.println("Ingrese el segundo Valor :\n");
			val2 = dato.nextInt();
			System.out.println("El Tercer valor se multiplicara por el cuarto\n");
			System.out.println("Ingrese el tercer Valor :\n");
			val3 = dato.nextInt();
			System.out.println("Ingrese el cuarto Valor :\n");
			val4 = dato.nextInt();
			System.out.println("Ambas multiplicaciones se restaran y dividiran por el quinto Valor");
			System.out.println("Ingrese el quinto valor :\n");
			val5 = dato.nextInt();	
			
			if( val1 <= max  && val1 >= min && val2 <= max  && val2 >= min && //Condicional que valida la ejecucion del cálculo
				val3 <= max  && val3 >= min && val4 <= max  && val4 >= min ) {
			    resultado = ((val1 * val2) - (val3 * val4)) / val5;
			    System.out.println("El resultado de la operacion es :" + resultado);
			} else {
				System.out.println("Datos Incorrectos, debe ingresar valores menores a 100 y mayores a -200");//La via del falso  retrona un mensaje de error
				
			}

		}
