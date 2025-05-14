/*
MATRIZ EXEMPLO
*/

public class MATRIZ {
    public static void main(String[] args){

        //criando a matriz 3x3 vazia
        int[][] matriz = new int [3][3];

        //Atribuição de valores manualmente
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        //imprimindo a matriz
        System.out.println("Matriz 3x3:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //Quebra de linha após cada linha de matriz
        }
    }
}