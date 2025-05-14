/*
2) Faça um programa que leia uma matriz 3x4 de inteiros, substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.
*/

public class MATRIZquestão2 {
    public static void main(String[] args){


        int[][] matriz = new int [3][4];

        matriz[0][0] = 1;
        matriz[0][1] = -2;
        matriz[0][2] = 3;
        matriz[0][3] = -4;
        

        matriz[1][0] = -5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = -3;

        matriz[2][0] = 9;
        matriz[2][1] = -10;
        matriz[2][2] = 11;
        matriz[2][3] = -12;
        
        System.out.println("Matriz 3x4:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
                System.out.println("Matriz modificada 3x4:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] < 0){
                    matriz[i][j] = 0;
                }System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}