package com.lista1;

import java.util.Scanner;
import java.util.Arrays;
public class Exercicio1 {
    private int TAMANHO;
    private int[][] matrizAdj;
    Scanner sc = new Scanner(System.in);
    public Exercicio1(int T) {
        this.TAMANHO = T;
        this.matrizAdj = new int[T][T];
    }
    public void preencheMatriz() {
        System.out.println("Digite os valores da Matriz: \n");
        for (int i = 0; i < this.TAMANHO; i++) {
            for(int j = 0; j < this.TAMANHO; j++) {
                System.out.print("Digite o valor da linha [" + i + "][" + j + "] : ");
                this.matrizAdj[i][j] = sc.nextInt();
                System.out.println("");
            }
        }
    }
    public void mostraMatriz() {
            for(int[] linha : this.matrizAdj) {
                System.out.println(Arrays.toString(linha));
        }
    }
    public boolean ehDirigido() {
        boolean ehDirigido = true;
        for(int i = 0; i < this.TAMANHO; i++) {
            for (int j = 0; j < this.TAMANHO; j++) {
                if(this.matrizAdj[i][j] == this.matrizAdj[j][i]) {
                    return false;
                }
            }
        }
        return ehDirigido;
    }
    public void getArestas() {
        for(int i = 0; i < this.TAMANHO; i++) {
            for (int j = 0; j < this.TAMANHO; j++) {
                if(this.matrizAdj[i][j] == 1) {
                    System.out.println("Índices [" + i + "]["+ j + "] formam uma aresta.");
                }
            }
        }
    }
    public void getGrau() {
        for(int i = 0; i < this.TAMANHO; i++) {
            int nGraus = 0;
            for (int j = 0; j < this.TAMANHO; j++) {
                if(this.matrizAdj[i][j] == 1) {
                    nGraus++;
                }
            }
            System.out.println("Número de Graus do vértice [" + i + "]: " + nGraus);
        }
    }
    public void getListaDeAdjacencias() {
        System.out.println("Lista de Adjacências: ");
        for(int i = 0; i < this.matrizAdj.length; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < this.matrizAdj.length; j++) {
                if(this.matrizAdj[i][j] == 1) {
                    System.out.print("-> " + j + " ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da Matriz Adjacente: ");
        int tamanho =  sc.nextInt();
        System.out.println(" ");

        Exercicio1 exercicio1 = new Exercicio1(tamanho);

        exercicio1.preencheMatriz();
        exercicio1.mostraMatriz();

        System.out.println(" ");

        System.out.println("Grafo Dirigido = " + exercicio1.ehDirigido());

        exercicio1.getArestas();
        exercicio1.getGrau();
        System.out.println(" ");
        exercicio1.getListaDeAdjacencias();
    }
}
