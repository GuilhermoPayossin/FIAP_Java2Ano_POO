package Exercicio1;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2;

    public double calcularMedia () {
        return (nota1 + nota2) / 2;
    }

    public String status() {
        if (calcularMedia() < 7) {
            return "Reprovado";
        }
        return "Aprovado";
    }

    public void imprimirDados () {
        System.out.println("Nome: " + nome);
        System.out.println("RM: " + rm);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        System.out.print("Status: " + status());
    }
}
