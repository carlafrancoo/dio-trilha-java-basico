import java.util.Scanner;

public class EquilibrandoSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do seu saldo: ");
        double saldoAtual = scanner.nextDouble();

        System.out.println("Por favor, digite o valor do seu depósito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.println(" Por favor, digite o valor do seu saque: ");
        double valorRetirada = scanner.nextDouble();


       double saldoFinal = saldoAtual + valorDeposito - valorRetirada;
            
        System.out.println("Saldo atualizado na conta: " + saldoFinal);
    }
}