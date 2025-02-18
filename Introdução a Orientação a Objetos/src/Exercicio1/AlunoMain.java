package Exercicio1;

import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.print("Insira o nome do aluno: ");
        aluno1.nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Insira o rm do aluno: ");
        aluno1.rm = sc.nextInt();
        System.out.print("Insira a primeira nota do aluno: ");
        aluno1.nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        aluno1.nota2 = sc.nextDouble();

        aluno1.imprimirDados();

        sc.close();
    }
}
