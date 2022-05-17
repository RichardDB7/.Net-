public static void main(String args[]) {
		int a=3, b=2;
		var resultado = a+b;
		System.out.println("resultado suma = " + resultado);
		
		resultado = a - b;
		System.out.println("resultado resta = " + resultado);
		resultado = a * b;
		System.out.println("resultado multiplicación = " + resultado);
		var resultado2 = 3F / b;
		System.out.println("resultado división = " + resultado2);
		
		resultado =  a % b;//Operador de cálculo de módulo
		System.out.println("resultado modulo = " + resultado);
		
		if(b % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
			int a = 3, b =2;
				int c = a + 5 - b ;
			System.out.println("c = " + c);
			
			a+=1;// a = a + 1 //Operador de composición
			System.out.println("a = " + a);
			a += 3;//a = a + 3
			System.out.println("a = " + a);
			a -= 2;//a = a - 2
			System.out.println("a = " + a);
			a *= 2;//a = a * 2
			System.out.println("a = " + a);
			a /= 2;//a = a / 2
			System.out.println("a = " + a);
			
		
			var a = 3;
			var b = -a;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			
			var c = true;
			var d = !c;
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			
			//Incremento
			var e = 3;
			var f = ++e;//primero se incrementa la variable y despues se usa su valor
			System.out.println("e = " + e);
			System.out.println("f = " + f);
			//Post incremento(Simbolo despues de la variable)
			var g = 5;
			var h = g++;//Primero se utiliza el valor y despues se incrementa
			System.out.println("g = " + g);//Incremento 6
			System.out.println("h = " + h);//5
			//Decremento
			//Predecremento
			var i = 2;
			var j = --i;
			System.out.println("i = " + i);//Ingreso decremento
			System.out.println("j = " + j);
			//Postdecremento
			var k = 4;
			var l = k--;//Primero se usa el valor de la variable y queda pendiente decremento
			System.out.println("k = " + k);//Tenia  pendiente un decremento
			System.out.println("l = " + l);*/
		
			//Operadores de Igualdad
			var a = 3;
			var b = 2;
			
			var c = (a == b);
			System.out.println("c = "+ c);
			
			var d = a != b;
			System.out.println("a = " + d);
			
			var cadena = "hola";
			var cadena2 = "Adios";
			var e = cadena == cadena2;//Compara  referencias de objetos
			System.out.println("e = " + e);
			
			var f = cadena.equals(cadena2);//Comparamos contenido de cadenas/Strings		
			System.out.println("f = " + f);
			
			//Operadores Relacionales
			var g =  a >= b;//Mayor e igual que
			System.out.println("g = " + g);
			
			if (a % 2 == 0) {
				System.out.println("Es numero par");
			}else {
				System.out.println("Es numero impar");
			}
			var edad = 30;
			var adulto = 18;
			if(edad >= adulto) {
				System.out.println("Es un adulto");
			}else {
				System.out.println("Es menor");
			}
		
		
		
			//Operadores Condicionales
			
			var a = -1;
			var  valorMinimo = 0;
			var	 valorMaximo = 10;
			
			var resultado = a >= 0 && a <= 10;
			if (resultado) {
				System.out.println("Dentro del rango");
			}else {
				System.out.println("Fuera del rango");
			}
			
			var vacaciones = true;
			var diaDescanso = false;
			
			if (vacaciones || diaDescanso) {
				System.out.println("El padre puede asistir al juego");
			}else {
				System.out.println("El padre esta ocupado");
			}
			
			
			//Operador Ternario
			//Este operador es una buena sustitucion del if/else statement
			var resultado = (3 > 2) ? "Verdadero" : "Falso" ;
			var resultado2 = (1 > 2) ? "Verdadero" : "Falso" ;
			System.out.println("El resultado es :"+ resultado);
			System.out.println("El resultado es :"+ resultado2);
		
			var numero = 9;
			resultado = (numero % 2 == 0) ? "Es número Par" : "Es número Impar";
			System.out.println("El resultado es :"+ resultado);*/
			
			
			//Precedencia de operadores
			var x = 5;
			var y = 10;
			var z = ++x + y--;//Operadores unarios aplicados de izquierda a derecha
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);*/
		
			var resultado = 4 + 5 * 6 / 3;//4 +	(5*6) /3
			System.out.println("Resultado =" + resultado);
			resultado = (4+5) * 6 / 3;
			System.out.println("Resultado =" + resultado);*/
			//TAREA
		 	Scanner teclado = new Scanner (System.in);
		 	
			int perimetro = 0;
			int area = 0;
			
			System.out.println("Ingrese el alto:");
			int alto = teclado.nextInt();
			System.out.println("Ingrese el ancho:");
			int ancho = teclado.nextInt();
			
			area = alto * ancho;
			perimetro = (alto + ancho)*2;
			
			
			System.out.println("El area mide:" + (area = alto * ancho));
			System.out.println("El perimetro mide:"+ (alto + ancho)*2);*/
			
			Scanner teclado = new Scanner (System.in);
		
			System.out.println("Ingrese primer valor:");
			int val1 = teclado.nextInt();
			System.out.println("Ingrese segundo valor:");
			int val2 = teclado.nextInt();
		
			if(val1 > val2) {
				System.out.println("El primer valor es mayor");
			}else {
				System.out.println("El segundo valor es mayor");
			}
			
			//Estructura if/else
			var condicion = false;
			
			if (condicion == true) {
				System.out.println("La condicion es verdadera");
				System.out.println("La condicion es chingona");
			}else {
				System.out.println("La condicion es falsa");
			}
			
		
		
		
	
	}
}
