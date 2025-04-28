/******************************************************************************

3.   Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.


*******************************************************************************/
import java.util.Scanner;
public class repetiçao3
{
	public static void main(String[] args) {
    
    Scanner batata = new Scanner(System.in);
    
    int pedido;
    
    System.out.println("Qual tabúada você você deseja?: ");
    pedido = batata.nextInt();
    
    int tabuada = 0;
    
    while(tabuada < 11){
        System.out.println(pedido + " X " + tabuada + " = " + (pedido * tabuada));
        tabuada++;
    }
    batata.close();
  }
}