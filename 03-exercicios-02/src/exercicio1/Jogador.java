package exercicio1;

public class Jogador {

    private String nome;
    private int[] score = new int[3];

    public int totalScore() {
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total;
    }

    public void receberScore (int i, int score) {
        this.score[i] = score;
    }

    public void imprimir() {
        System.out.println("Nome do jogador: " + nome);
        for (int i = 0; i < score.length; i++) {
        System.out.println("Pontuação da rodada " + (i + 1) + ": " + score[i]);
        }
        System.out.println("Pontuação total: " + totalScore());
    }

    public int[] getScore() {
        return score;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
