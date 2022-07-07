
/*Realizar un programa que seleccionar en pantalla poder realizar cuatro cálculos matemáticos (suma, resta, multiplicación y división); 
pedir que seleccione el tipo de cálculo que se desee realizar (sólo uno); Luego, solicitar que sean ingresadas las variables correspondientes en cada caso; 
Y, por último, imprimir el resultado en pantalla, indicando qué cálculo se realizo, aplicando en la medida que se pueda, los conceptos de Encapsulamiento, 
Herencia y Polimorfismo*/

CLASE OBJETO 1 ENCAPSULAMIENTO

public class Calculadora {
	//Atributos de la clase
		private int n1;
		private int n2;
		
		//Constructores
		public Calculadora() {
			
		}
		public Calculadora(int n1, int n2) {
			this.n1 = n1;
			this.n2 = n2;
		}
		
		//Metodos de las operaciones del objeto calculadora
			public int  suma() {
			int suma =  this.n1 + this.n2;
			return suma;		
			}
			public int resta() {
			int resta = this.n1 - this.n2;
			return resta;
			}
			public int mult() {
			int mult = this.n1 * this.n2;
			return mult;	
			}
			public double div() {
			double div = (double)this.n1 / (double)this.n2;
			return div;
			}
			public int getn1() {
				return n1;
			}
			public void setn1(int n1) {
				this.n1 = n1;
			}
			public int getn2() {
				return n2;
			}
			public void setn2(int n2) {
				this.n2 = n2;


------Dentro de POO es buena practica realizar el método main o cuerpo principal en otra Clase, a fines practicos aquí la realizaré en este lugar------

CLASE OBJETO 2 ABSTRACCIÓN

/*Aplicand el concepto de abstracción realizo un metodo con iteracion ,finalización del programa y captura de un posible error*/

public abstract class finPrograma {

	public static boolean finPrograma(){
		Boolean intentos = true;
		while(intentos) {
			Scanner read = new Scanner(System.in);
			System.out.println("Desea salir? \n1 - Si \t - 2 No\n:>	");
			String reader = read.next();
			int opcion = intTryParse(reader);
			if(opcion == 1) {
				intentos = false;
				break;
			}
			else if(opcion == 2) {
				intentos = true;
				break;
			}
		}
		return intentos;
		
	
	}

	private static int intTryParse(String resultado) {
		try {
			return Integer.parseInt(resultado);
		} catch(NumberFormatException e) {
			return 0;


------Dentro de POO es buena practica realizar el método main o cuerpo principal en otra Clase, a fines practicos aquí la realizaré en este lugar------

CUERPO PRINCIPAL MAIN

public class Ejercicio4  {

		static Scanner input = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			Boolean intentos = true;
			
			
			while(intentos == true) {//Creo un ciclo while que contiene todas la operaciones
				
			System.out.println("Ingrese operacion");
			System.out.println("+: S" + "\n-: R " + "\n*: M"+"\n/: D"+"\nE: Salir");
			char operacion = input.next().charAt(0);
			
			if(operacion == 'S' || operacion == 'R' || operacion == 'M' || operacion == 'D'){
			//Condicion que me permite seleccionar que operacion se dispara al iniciar el switch	
				
				System.out.println("Ingrese un numero entero");
				int n1 = input.nextInt();
				System.out.println("Ingrese un numero entero");
				int n2 = input.nextInt();
				double resultado = 0;
				
				Calculadora MiCalculadora = new Calculadora(n1,n2);
				
				switch(operacion) {
				case 'S':
					resultado = MiCalculadora.suma();//Llamado al objeto Mi Calculadora y a la accion suma
					break;
				case 'R':
					resultado = MiCalculadora.resta();//Llamado al objeto Mi Calculadora y a la accion resta
					break;	
				case 'M':
					resultado = MiCalculadora.mult();//Llamado al objeto Mi Calculadora y a la accion multiplicacion
					break;	
				case 'D':
					resultado = MiCalculadora.div();//Llamado al objeto Mi Calculadora y a la accion division
					break;	
					
				}
				
			System.out.println("El resultado de su operacion es :" + resultado);
			
				
			
			}else {
				System.out.println("Ingreso incorrecto !");
			
				
			}
			if(!finPrograma.finPrograma()){intentos = false;}//llamada al objeto finPrograma
			
			}
		
	}

