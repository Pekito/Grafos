package com.lista1;

import java.util.Arrays;
class Grafo4 {
    int[][] entrada;
    final int TAMANHO = 6;
    int[][] saida = new int[this.TAMANHO][this.TAMANHO];
    public void criarMatrizTriangularOrdenada() {
        for (int i = 0; i < this.TAMANHO; i++) {
            for(int j = 0; j < this.TAMANHO; j++) {
                this.saida[i][j] = this.entrada[j][i];
            }
        }
    }
    public void mostrarMatrizEntrada() {
        for (int linha[] : this.entrada) {
            System.out.println(Arrays.toString(linha));
        }
    }
    public void mostrarMatrizSaida() {
        for (int linha[] : this.saida) {
            System.out.println(Arrays.toString(linha));
        }
    }
    public Grafo4() {
        this.entrada = new int[][]{{0, 0, 0, 0, 0, 0},{1, 0, 0, 0, 0, 0},{1, 0, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},{0, 1, 1, 0, 0, 0},{1, 0, 0, 0, 1, 0}};
    }
}
public class Exercicio4 {

    public static void main(String[] args) {
        Grafo4 ex4 = new Grafo4();
        ex4.criarMatrizTriangularOrdenada();
        ex4.mostrarMatrizEntrada();
        System.out.println();
        ex4.mostrarMatrizSaida();
}
}
