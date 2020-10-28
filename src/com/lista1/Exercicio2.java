package com.lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    private int vertices;
    private int[][] matrizAdj;
    public Exercicio2(int v) {
        this.vertices = v;
        matrizAdj = new int[v][v];
    }
    public void criarGrafoCompleto() {
        for(int i = 0; i < this.vertices; i++) {
            for(int j = 0; j < this.vertices; j++) {
                if (i != j) {
                    this.matrizAdj[i][j] = 1;
                }
                else {
                    this.matrizAdj[i][j] = 0;
                }
            }
        }
    }
    public void mostrarMatrizAdjacencia() {
        System.out.println("Matriz de Adjacências");
        for (int[] linha : this.matrizAdj) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println(" ");
    }
    public void mostrarListaAdjacencia() {
        System.out.println("Lista de Adjacências: ");
        for(int i = 0; i < this.vertices; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < this.vertices; j++) {
                if(this.matrizAdj[i][j] == 1) {
                    System.out.print("-> " + j + " ");
                }
            }
            System.out.println(" ");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de vértices: ");
        int num1 = sc.nextInt();
        Exercicio2 ex2 = new Exercicio2(num1);
        ex2.criarGrafoCompleto();
        ex2.mostrarListaAdjacencia();
        ex2.mostrarMatrizAdjacencia();
    }
}
