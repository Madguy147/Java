/*
SEGUNDA ATIVIDADE

DESENVOLVA UM PROGRAMA QUE CALCULE A SOMA DE SOMA DE DOIS NÚMEROS

*/
import java.util.Scanner; //ENTRADAS DO TECLADO
public class Soma
{
	public static void main(String[] args) {
	    
	    double a,b,soma; // declarar variável
		Scanner ler = new Scanner(System.in);
		
	System.out.println("Entre com um número:  ");
	a = ler.nextDouble();
	
	System.out.println("Entre com um número:  ");
	b = ler.nextDouble();
	
	soma = a + b;
	
	System.out.println("O resultado será:  " + soma);
	}
}