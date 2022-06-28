
//MÉTODOS
public class Aritmetica {
		//Atributos de la clase
		int  a;
		int  b;
		
		//Primer Metodo sin retorno específico
		public void sumar() {
		int resultado = a + b; //El valor de la operacion a + b se se carga en la variable entera resultado 
		System.out.println("Resultado : "+ resultado);
		}
		//Segundo Metodo con retorno específico
		public int sumarConRetorno() {
			/*int resultado = a + b;
			return resultado;*/
			return a + b; //Simplificación de código
		}
		//Tercer Metodo con retorno específico y argumentos
		public int sumarConArgumentos(int a, int b) {
			//Mediante el operador this referenciamos atributos de la clase actual
			this.a = a; //El argumento a  se asigna al atributo this.a
			this.b = b; 
			//return a + b;	
			return this.sumarConRetorno();//Reutilizamos el segundo método previamente definido y el operador this esta referenciando al metodo de la clase actual
			}
		}
------Dentro de POO es buena practica realizar el método main o cuerpo principal en otra Clase, a fines practicos aquí la realizaré en este lugar------
  
     /*Aqui se encuentran los objetos de la clase Aritmetica*/
	

  public class PruebaAritmetica {
	 public static void main(String[] args) {
		Aritmetica aritmetica1 = new Aritmetica();//Mediante el Constructor Aritmetica creamos un nuevo objeto
		//Antes de invocar el método suma modificamos los valores de los atributos de la clase Aritmetica
		aritmetica1.a = 3;
		aritmetica1.b = 2;
		//Se invoca el primer metodo
		aritmetica1.sumar();
		
		//Se invoca el segundo metodo de la clase Aritmetica
		var resultado = aritmetica1.sumarConRetorno();
		System.out.println("Resultado : " + resultado);
		
		//Se invoca el tercer metodo pasando los parámetros correspondientes
		resultado = aritmetica1.sumarConArgumentos(5 , 8);
		System.out.println("Resultado usando argumentos = "+ resultado);
		
	}
}
