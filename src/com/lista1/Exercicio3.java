package com.lista1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class ParOrdenado {
    public int valor;
    public int adjacencia;

    public ParOrdenado(int valor, int adjacencia) {
        this.adjacencia = adjacencia;
        this.valor = valor;
    }
}
class Grafo {
    private final int TAMANHO;
    private ParOrdenado[][] matrizAdj;
    private int numeroDeVertices;
    private Stack<Integer> stack;
    public Grafo(int tamanho) {
        this.TAMANHO = tamanho;
        this.matrizAdj = new ParOrdenado[tamanho][tamanho];
        this.stack = new Stack<Integer>();
        this.numeroDeVertices = 0;
    }
    public void preencheMatrizAdj() {
        Scanner scanValor = new Scanner(System.in);
        int valorAtual;
        int adjacenciaAtual;
        ParOrdenado parOrdenadoAtual;
        for(int i = 0; i < this.TAMANHO; i++) {
            for(int j = 0; j < this.TAMANHO; j++) {
                if (this.matrizAdj[i][j] == null) {
                    if (i != j) {
                        System.out.print("Digite o valor da linha [" + i + "][" + j + "] : ");
                        valorAtual = scanValor.nextInt();
                        System.out.print("Digite a adjacência da linha [" + i + "][" + j + "] : ");
                        adjacenciaAtual = scanValor.nextInt();
                        parOrdenadoAtual = new ParOrdenado(valorAtual, adjacenciaAtual);
                        this.matrizAdj[i][j] = parOrdenadoAtual;
                        this.matrizAdj[j][i] = parOrdenadoAtual;
                    }
                    else {
                        this.matrizAdj[i][j] = new ParOrdenado(0,0);
                    }
                }

            }
            System.out.println(" ");
        }
    }
    public void mostrarListaAdj() {
        System.out.println("Lista de Adjacências: ");
        for(int i = 0; i < this.TAMANHO; i++) {
            System.out.print(i + ": ");
            for(int j = 0; j < this.TAMANHO; j++) {
                if(this.matrizAdj[i][j].adjacencia == 1) {
                    System.out.print(" -> [" + j + "] Valor: " + this.matrizAdj[i][j].valor);
                }
            }
            System.out.println(" ");
        }
    }
}
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do Grafo: ");
        int tamanho = scanner.nextInt();
        System.out.println(" ");
        Grafo grafo = new Grafo(tamanho);
        grafo.preencheMatrizAdj();
        System.out.println(" ");
        grafo.mostrarListaAdj();
    }
}
