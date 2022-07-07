/*- Realizar un programa que permita leer de teclado diez valores enteros 
positivos; Y que permita, cada vez que se ingrese uno de los mismos, 
imprimir en pantalla si es par, si es impar e identificar el cero.*/

public class Ejercicio3 {

	public static void main(String[] arg) {
		
		Scanner dato = new Scanner(System.in);
		
		int [] val = new int[10]; //Definimos la matriz de diez valores
		
		
		for(int i=0; i<val.length;i++) {//Recorrido de la matriz y carga
		
			System.out.println("Ingrese el valor en la posicion : [ " + i + " ] ");
			val[i] = dato.nextInt();
			
			if( val[i] % 2 == 0)  {//Condiciones requeridas
				System.out.println("El número es par\n");
			}
			else if( val[i] % 2 != 0)  {
				System.out.println("El número es impar\n");
			}
			else if (val[i] == 0) {
				System.out.println("El numero es cero\n");
			}
			System.out.println("El valor es : \n"+ val[i]);
			
			if(val[i]<0){
				System.out.println("El valor es negativo, ingrese un valor positivo");
			}
			
			}
			dato.close();//Cierre de transmisión y liberación de recursos
		
	}
	
	
}
