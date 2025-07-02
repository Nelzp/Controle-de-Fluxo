import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numeroUm = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numeroDois = sc.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        sc.close();

    }
    static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {

        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
