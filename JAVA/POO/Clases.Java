package Clases;

/* Una clase podemos definirla como una plantilla o molde, de la cual creamos objetos. 
   La misma posee nombre, atributos y métodos los cuales abstraen la información del mundo real.
   En particular, esta clase persona contiene los atributos nombre y apellido
   junto con el metodo desplegarInformacion que recupera el contenido de las variables*/


public class Persona { //Nombre de la Clase
	
	//Atributos de la clase 
	
	String nombre;
	String apellido;
	
	//Metodo de la clase
	public void desplegarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " +  apellido);
	}
	
  ------Dentro de POO es buena practica realizar el método main o cuerpo principal en otra Clase, a fines practicos aquí la realizaré en este lugar------
  
  public class PruebaPersona {
	public static void main(String[] args) {
		
		//PRIMERA INSTANCIA O INSTANCIACI�N
		Persona persona1 = new Persona();//Se crea la variable y el objeto reservando es espacio en memoria mediante el metodo new		
		persona1.nombre = "Juan";//Accedemos a los atributos para leer o modificar
		persona1.apellido = "Perez";
		persona1.desplegarInformacion();//Mediante el metodo desplegar informacion accedemos a los atributos desde la clase
		System.out.println("persona1 = "+ persona1);
		
		//SEGUNDA INSTANCIA	U OBJETO
		Persona persona2 = new Persona();
		persona2.nombre = "Karla";
		persona2.apellido = "Lara";
		persona2.desplegarInformacion();
		System.out.println("persona2 = "+ persona2);
		
			
	    }
    }
  }
