package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador1 = new Jogador();

        System.out.print("Digite seu nome: ");
        jogador1.setNome(sc.nextLine());

        for (int i = 0; i < jogador1.getScore().length; i++) {
            System.out.print("Digite a pontuação da rodada" + (i + 1)+ ": ");
            jogador1.receberScore(i, sc.nextInt());
        }

        jogador1.imprimir();

        System.out.println();
    }
}
