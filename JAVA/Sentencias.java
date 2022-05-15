import java.util.Scanner;

public class Sentencias {
	public static void main(String args[]) {
	
	
	//IF/ ELSE
	var numero = 4;
	var numeroTexto = "Numero Desconocido";
	
	if( numero == 1 ) {
		numeroTexto = "numero uno ";
	}	
	else if( numero == 2 ) {
		numeroTexto ="numero dos";
	}else if( numero == 3) {
		numeroTexto = "numero 3";
	}else if( numero == 4 ) {
		numeroTexto = "numero 4";
	}else {
		numeroTexto = "numero no encontrado";
	}
	System.out.println("numeroTexto = "+ numeroTexto);
	
	}
		
	//CALCULO ESTACION DEL AÑO
		/*Scanner teclado = new Scanner(System.in);
		var mes	= 1;
		var estacion = "Estacion desconocida";
		System.out.println("Ingrese el mes para concer la estacion");
		mes = teclado.nextInt();
		
		if (mes == 1 || mes == 2 || mes == 3) {
			estacion = "Verano";	
		}	
		else if(mes == 4 || mes == 5 || mes == 6) {
			estacion = "Otoño";
		}	
		
		
		else if(mes == 7 || mes == 8 || mes == 9){
			estacion = "Invierno";
		}	
		
		else if(mes == 10 || mes == 11 || mes == 12){
			estacion = "Primavera";
		}
		
		
		System.out.println("La estacion es "+"=" + estacion);*/
		
		//Sentencia Switch
			var numero = 4;
			var numeroTexto = "Valor desconocido";
			
			switch(numero) {
			case 1:
				numeroTexto = "Numero uno";
				break;
			case 2:
				numeroTexto = "Numero dos";
				break;
			case 3:
				numeroTexto = "Numero tres";
				break;
			case 4:
				numeroTexto = "Numero cuatro";
				break;
			default:
				numeroTexto = "Caso no encontrado";	
			}
			System.out.println("numeroTexto = " + numeroTexto);
		
		//CALCULO DE ESTACION CON SWITCH
			Scanner teclado = new Scanner (System.in);
		
			var mes = 1;
			var estacion = "Estacion Desconocida";
			
			System.out.println("Ingrese el mes correspondiente a la estacion : ");
			mes = teclado.nextInt();
			switch(mes) {
			case 1: case 2: case 3:
				estacion = "Verano";
				break;
			case 4: case 5: case 6:
				estacion = "Otoño";
				break;
			case 7: case 8: case 9:
				estacion = "Invierno";
				break;
			case 10: case 11: case 12:
				estacion = "Primavera";
				break;
			
			}
			System.out.println("La estacion es" +" "+ estacion);*/
			
		//SISTEMA DE CALIFICACIONES
		Scanner dato = new Scanner(System.in);
		
		var cal = 0;
		System.out.println("Ingrese la calificacion : ");
		cal = dato.nextInt();
		
		switch(cal) {
		case 9: case 10:
			System.out.println("La calificacion es de A");
			break;
		case 8: case 7:	
			System.out.println("La calificacion es de B");
			break;
		case 6: case 5:
			System.out.println("La calificacion es de C");
			break;
		case 4:	case 3:
			System.out.println("La calificacion es de D");
			break;
		case 2: case 1:
			System.out.println("La calificacion es de F");
			break;
		}
		Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
       int calificacion = Integer.parseInt(scanner.nextLine());
       //Si esta entre 9 y 10 imprimir: A
       if (calificacion >= 9 && calificacion <= 10)
           System.out.println("A");
       //Si esta entre  8 y menor a 9 imprimir: B
       else if(calificacion >= 8 && calificacion < 9)
           System.out.println("B");
       //Si esta entre 7 y menor a 8 imprimir: C
       else if(calificacion >= 7 && calificacion < 8)
           System.out.println("C");
       //Si esta entre 6 y menor a 7 imprimir: D
       else if(calificacion >= 6 && calificacion < 7)
           System.out.println("D");
       //Si esta entre 0 y menor a 6 imprimir: F
       else if(calificacion >= 0 && calificacion < 6)
           System.out.println("F");
       //Si no esta en el rago, imprimir: Valor desconocido
       else
           System.out.println("Valor desconocido");
		
		
		
		 
	}	
}
