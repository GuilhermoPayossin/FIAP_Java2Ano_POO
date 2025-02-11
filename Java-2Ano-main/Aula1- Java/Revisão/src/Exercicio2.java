import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j;
        int maior = 0, total;

        System.out.print("Informe o valor de i: ");
        i = sc.nextInt();
        System.out.print("Informe o valor de j: ");
        j = sc.nextInt();
        sc.close();

        for (; i <= j; i++) {
            total = calcular(i);
            if (total > maior) {
                maior = total;
            }
        }
        System.out.println("Número máximo de impressões: " + maior);
    }

    public static int calcular(int i) {
        int cont = 0;

        while (true) {
            //System.out.print(i + " ");
            cont++;
            if (i == 1)
                break;
            if (i % 2 == 1) {
                i = (3 * i) + 1;
            } else {
                i /= 2;
            }
        }
        return cont;

    }
}
