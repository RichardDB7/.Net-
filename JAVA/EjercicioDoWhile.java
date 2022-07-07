/*Realizar un programa que permita leer de teclado cinco valores reales entre 100 y -200;
 * Luego realizar el siguiente cálculo resultado = ((valor1 * valor2) – (valor3 * valor4)) / valor5; 
 * y por último imprimir en pantalla el resultado.*/

public class Ejercicio1 {
	

	
		public static void main(String[] args) {
		
		double val1=0,val2=0,val3=0,val4=0,val5=0,resultado;
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese valores reales comprendeidos ente -200 y 100");
		
		
		do {
			System.out.println("El primer Valor se multiplicara por el segundo\n");
			System.out.println("Ingrese el primer Valor :\n");
			val1=dato.nextDouble();
		}
		while(val1 < -200 || val1>100);
		
		
		do {
			System.out.println("Ingrese el segundo Valor :\n");
			val2=dato.nextDouble();
		}
		while(val2 < -200 || val2>100);
		
		do {
			System.out.println("El Tercer valor se multiplicara por el cuarto\n");
			System.out.println("Ingrese el tercer Valor :\n");
			val3=dato.nextDouble();
		}
		while(val3 < -200 || val3>100);
		
		do {
			System.out.println("Ingrese el cuarto Valor :\n");
			val4=dato.nextDouble();
		}
		while(val4 < -200 || val4>100);
		do {
			System.out.println("Ambas multiplicaciones se restaran y dividiran por el quinto Valor");
			System.out.println("Ingrese el quinto valor :\n");
			val5=dato.nextDouble();
		}
		while(val5 < -200 || val5>100 || val5 ==0);
		
		
		
		resultado = ((val1 * val2) - (val3 * val4)) / val5;
	    System.out.println("El resultado de la operacion es :" + resultado);
	
		
		
		
	}

		}
