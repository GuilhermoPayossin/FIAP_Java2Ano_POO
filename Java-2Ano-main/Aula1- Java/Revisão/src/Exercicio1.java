import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        imprimir(n);

        sc.close();
    }

    public static void imprimir(int n) {
        while (true) {
            System.out.print(n + " ");
            if (n == 1)
                break;
            if (n % 2 == 1) {
                n = (3 * n) + 1;
            } else {
                n /= 2;
            }
        }
        System.out.println("\nPrograma encerrado");
    }
}
