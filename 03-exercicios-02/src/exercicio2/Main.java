package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("RM: ");
        aluno.setRM(sc.nextInt());

        for (int i = 0; i < aluno.getDisciplina().length; i++) {
            System.out.println("Disciplina " + (i + 1) + ": ");
            System.out.print("Nome: ");
            aluno.adicionarDisciplina(i, sc.next());
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                aluno.adicionarNota(i, j, sc.nextDouble());
            }
            System.out.println();
        }

        aluno.imprimirDados();

    }
}
