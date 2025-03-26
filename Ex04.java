/*******************************************************************************
4. A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.
*******************************************************************************/
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o tempo de serviço do funcionário (em anos):");
        double tempo = scanner.nextDouble();

        if (tempo >= 5) {
            salario += salario * 0.20;
        } else {
            salario += salario * 0.10;
        }

        System.out.println("O novo salário do funcionário é: R$ " + salario);

        scanner.close();
    }
}