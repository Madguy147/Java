/******************************************************************************

4.   Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.

*******************************************************************************/
import java.util.Scanner;
public class repetiçao4
{
	public static void main(String[] args) {
    
    Scanner batata = new Scanner(System.in);
    
    int pedido;
    
    System.out.println("Qual tabúada você você deseja?: ");
    pedido = batata.nextInt();
    
    for(int i = 0; i < 11; i++){
        System.out.println(pedido + " X " + i + " = " + (pedido * i));
    }
    batata.close();
  }
}