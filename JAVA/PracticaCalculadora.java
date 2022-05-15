import java.util.Scanner;

public class Calculadora {
	
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
	
	
	
	
	
	
	
	private static int intTryParse(String reader) {
		// TODO Auto-generated method stub
		return 0;
	}







	public static void main(String[] args) {
		
		int a=0, b=0, res=0;
		String opcion=null;
		Boolean intentos = true;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione la opcion \n");
		System.out.println("+: Suma" + "\n-: Resta " + "\n*: Multiplicacion"+"\n/: Division"+"\nS: Salir");
		
		
		opcion = teclado.next();
		
		switch(opcion) {
		case "+":
			
			System.out.println("Ha Seleccionado suma\n");
			System.out.println("Ingrese el primer numero:\n");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero:");
			b = teclado.nextInt();
			res = a+b;
			System.out.println(a+"+"+b+"="+res);
			
			
			break;
		case "-":
			
			System.out.println("Ha Seleccionado resta\n");
			System.out.println("Ingrese el primer numero:\n");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero:");
			b = teclado.nextInt();
			res = a-b;
			System.out.println(a+"-"+b+"="+res);
			
			break;	
			
		case "*":
			
			System.out.println("Ha Seleccionado Multiplicacion\n");
			System.out.println("Ingrese el primer numero:\n");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero:");
			b = teclado.nextInt();
			res = a*b;
			System.out.println(a+"*"+b+"="+res);
			
			break;		
			
		case "/":
			
			System.out.println("Ha Seleccionado Division\n");
			System.out.println("Ingrese el primer numero:\n");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero:");
			b = teclado.nextInt();
			res = a/b;
			System.out.println(a+"/"+b+"="+res);
			
			break;
		case "s":
			finPrograma();
			break;
			
			
			
			default:
			
			System.out.println("Escoga la opcion correcta");
			
			
			break;
			
			}
			
			
			
		  
		}}
	
