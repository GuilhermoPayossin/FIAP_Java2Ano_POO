package exercicio2;

public class Aluno {
    private String nome;
    private int RM;
    private String[] disciplina = new String[3];
    private double[][] notas = new double[disciplina.length][2];

    public double mediaDisciplina(int i) {
        double media = 0;
        for (int j = 0; j < notas[i].length; j++) {
            media += notas[i][j];
        }
        return media / notas[i].length;
    }

    public String verificarStatus(int i) {
        if (mediaDisciplina(i) >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public void adicionarDisciplina(int i, String disciplina) {
        this.disciplina[i] = disciplina;
    }

    public void adicionarNota(int i, int j, double notas) {
        this.notas[i][j] = notas;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RM: " + RM);
        System.out.println();
        for (int i = 0; i < disciplina.length; i++) {
            System.out.println("Disciplina: " + disciplina[i]);
            System.out.println("Média: " + mediaDisciplina(i));
            System.out.println("Status: " + verificarStatus(i));
            System.out.println();
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRM(int RM) {
        this.RM = RM;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public double[][] getNotas() {
        return notas;
    }
}
