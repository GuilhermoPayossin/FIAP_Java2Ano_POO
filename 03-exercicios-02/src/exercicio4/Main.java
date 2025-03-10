package exercicio4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Guilhermo",1800.00, "Estagiario");
        System.out.println(funcionario);

        funcionario.aumentarSalario(10);
        System.out.println(funcionario);

        funcionario.aumentarSalario(15, "Júnior");
        System.out.println(funcionario);

        funcionario.promover("Júnior");
        funcionario.aumentarSalario(25, "Júnior");
        System.out.println(funcionario);
    }
}
