package exercicio3;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(2, 2);
        Ponto p2 = new Ponto(7, 7);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.println("Distância entre os pontos p1 para p2: " + f.format(p1.calcularDistancia(p2)));
        System.out.println("Distância entre os pontos p2 para p1: " + f.format(p2.calcularDistancia(p1)));
        System.out.println("Distância do ponto p1 para a origem: " + f.format(p1.calcularDistanciaAteOrigem()));
        System.out.println("Distância do ponto p2 para a origem: " + f.format(p2.calcularDistanciaAteOrigem()));

        Ponto maisProximo = Ponto.maisProximoDaOrigem(p1, p2);
        System.out.println("Ponto mais proximo da origem: " + (maisProximo.x + " " + maisProximo.y));

    }
}
