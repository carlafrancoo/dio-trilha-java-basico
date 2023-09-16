import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        valorFinal = Double.parseDouble(String.format("%.2f", valorFinal));

        System.out.println("Valor final do investimento: R$ " + valorFinal);

        scanner.close();
    }
}