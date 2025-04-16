/******************************************************************************

54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.


*******************************************************************************/
import java.util.Scanner;

public class Ex_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite a quantidade de valores: ");
        int N = scanner.nextInt();
       
        int[] numeros = new int[N];
       
        int contPares = 0;
        int produtoImpares = 1;
        boolean encontrouImpar = false; 
        
        System.out.println("Digite " + N + " números inteiros:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
           

            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {

                produtoImpares *= numeros[i];
                encontrouImpar = true;
            }
        }
       

        System.out.println("Quantidade de números pares: " + contPares);
       
        if (encontrouImpar) {
            System.out.println("Produto dos números ímpares: " + produtoImpares);
        } else {
            System.out.println("Não houve números ímpares para multiplicar.");
        }

 
    }
}