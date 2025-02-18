package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        System.out.print("Digite o nome do paciente: ");
        paciente1.setNome(sc.nextLine());
        System.out.print("Digite a idade do paciente: ");
        paciente1.setIdade(sc.nextInt());

        paciente1.imprimirDados();
    }
}
