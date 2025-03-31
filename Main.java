/*
Repetição
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n;
	    
		System.out.println("Escolha o número:  ");
		n = ler.nextInt();
		
	    for(int i = 0; i <= n; i++)
	    		System.out.println("Número " + i);
	}
}