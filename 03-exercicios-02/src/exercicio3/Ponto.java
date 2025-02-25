package exercicio3;

public class Ponto {
    int x;
    int y;

    public double calcularDistancia(Ponto p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public double calcularDistanciaAteOrigem() {
        Ponto origem = new Ponto(0, 0);
        return calcularDistancia(origem);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Ponto maisProximoDaOrigem(Ponto p1, Ponto p2) {
        double distp1 = p1.calcularDistanciaAteOrigem();
        double distp2 = p2.calcularDistanciaAteOrigem();
        if (distp1 > distp2) {
            return p1;
        }
        return p2;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
