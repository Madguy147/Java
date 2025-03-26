/******************************************************************************

12 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            int anosFaltando = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento militar.\n", anosFaltando);
        } else if (idade == 18) {
            System.out.println("Você deve se alistar neste ano.");
        } else {
            int anosPassados = idade - 18;
            System.out.printf("Você já deveria ter se alistado há %d anos.\n", anosPassados);
        }

        scanner.close();
    }
}