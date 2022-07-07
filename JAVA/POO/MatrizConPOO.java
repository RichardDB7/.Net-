/*Realizar un programa que permita leer de teclado valores reales entre 1 y 9 
 *para cargarlos dentro de una matriz de 6x6, continuar sacando el promedio de 
 *todos los valores; y para finalizar imprimir el resultado. 
 *Aplicar POO en el desarrollo de la matriz.*/


public  class Ejercicio2  { 
		public static void main(String[] args) {
			
			int n=6;
			double[][] matriz = new	double[n][n];
			//Instanciación 
			Mat mat = new Mat();
			//Invoco los métodos
			mat.carga(matriz);//Ingreso el parámetro que tomará el método carga
			mat.promedio(matriz);// Ingreso el parámetro para que se realize el promedio de la carga de datos en la matriz
			
		}	
}	

 ------Dentro de POO es buena practica realizar el método main o cuerpo principal en otra Clase, a fines practicos aquí la realizaré en este lugar------
   
   public class Mat {
		
		//Añado las caracteristicas 
		private double mat[][]; //Mediante el modificador private encapsulamos los atributos
		
		//A través de los métodos getter and setter accedemos a los datos privados
		//Getters - Aqui obtengo el dato
		public double[][] getM(){
			return mat;
		}
		//Setter - Aqui se establece la manera de obtener el dato
		public void setM(double mat[][]) {
			this.mat = mat; //Mediante this referenciamos los atributos de manera global para su reutilización 
		}
		
		//El metodo constructor devuelve la clase al main
		public Mat(){
			setM(new double[6][6]);
			
			
		}
		
		//Elaboracion del método carga
		public void carga(double [][] mat) {
			Scanner dato = new Scanner(System.in);    //Cuerpo del método
			for(int i=0; i < mat.length ; i++) {     
				for(int j = 0; j < mat.length;j++) {
					System.out.println("Ingrese el número [" + i + "][" + j + "] :");
				    mat[i][j] = dato.nextDouble();
				    //Condicional mayor que uno y menor que nueve
				    if(mat[i][j] < 1 || mat[i][j]>9) {         //Solucion trivial
				    	System.out.println("Ingrese el valor entre 1 y 9");
				    	mat[i][j] = dato.nextDouble(); 
				    }
				}
			}
			dato.close();
		}
		
	
		//Aqui establezco el método para obtener el promedio de todos los valores
		public void promedio(double[][] mat) {
			Double suma = 0.0;       //Cuerpo del método
			int cont = 0;
			for(int i=0	;i < mat.length; i++) {//Recorrido del vector, sumando cada una de sus posiciones
				for(int j=0;j <mat.length;j++) {      
					suma = suma + mat[i][j];           //Solucion trivial
					cont = cont + 1;
				}
			}
			System.out.println("El promedio de los valores de la matriz es : " + suma/cont);//Obtencion de promedio dividiendo la variable suma / contador
			}
		}
		
