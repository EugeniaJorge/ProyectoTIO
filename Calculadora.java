import java.io.BufferedReader;
import java.io.InputStreamReader;
class calculadora {
  public static void main(String[] args) {
    
    double numero1;
    double numero2;
    char letra;
    double resultado;
    try{
      BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("Ingrese un numero: ");
      numero1 = Double.valueOf(entrada.readLine());
      System.out.println("Ingrese un segundo numero: ");
      numero2 = Double.valueOf(entrada.readLine());
      System.out.println("Ingrese A(SUMA) B(RESTA) c(Multiplicacion) o D(Division): ");
      letra = entrada.readLine().charAt(0);
      if (letra == 'a'|| letra =='A'){
        sumar(numero1,numero2);
      }
      if (letra == 'b'|| letra =='B'){
        restar(numero1,numero2);
      }
      if (letra == 'c'|| letra =='C'){
        multiplicar(numero1,numero2);
      }
      
    }catch (Exception exc){
      System.out.println(exc);
    } 
  }
	public static void sumar(double n1, double n2){
      System.out.println(n1+n2);
    }
	public static void multiplicar(double n1, double n2){
      System.out.println(n1*n2);
    }
	public static void restar(double n1, double n2) {
		System.out.println(n1-n2);
	}
	}
}