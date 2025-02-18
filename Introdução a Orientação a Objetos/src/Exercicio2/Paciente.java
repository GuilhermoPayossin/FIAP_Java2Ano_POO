package Exercicio2;

public class Paciente {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int frequenciaMaxima () {
        return 220 - idade;
    }

    public double[] frequenciaAlvo () {
        double[] alvo = new double[2];
        double maxima = frequenciaMaxima();
        alvo[0] = maxima * 0.5;
        alvo[1] = maxima * 0.85;
        return alvo;
    }

    public void imprimirDados () {
        double[] alvo = frequenciaAlvo();
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Idade do paciente: " + idade);
        System.out.println("Frequência cardíaca máxima: " + frequenciaMaxima());
        System.out.println("Frequência cardíaca alvo mínima: " + alvo[0]);
        System.out.println("Frequência cardíaca alvo máxima: " + alvo[1]);
    }
}
