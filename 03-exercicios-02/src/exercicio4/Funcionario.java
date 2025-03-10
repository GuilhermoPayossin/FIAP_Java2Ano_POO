package exercicio4;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void promover(String novoCargo) {
        cargo = novoCargo;
        System.out.println("Funcionário promovido para " + novoCargo );
    }

    public void aumentarSalario (int percentual) {
        this.salario += this.salario * percentual / 100;
        System.out.println("Salário de " + this.nome + " aumentado");
    }

    public void aumentarSalario (int percentual, String cargo) {
        if (this.cargo.equalsIgnoreCase(cargo)) {
            aumentarSalario(percentual);
            return;
        }
        System.out.println("Cargo incompativel, aumento não recebido");
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome +
                "\nCargo: " + cargo +
                "\nSalário: " + String.format("%.2f", salario) + "R$";
    }
}
