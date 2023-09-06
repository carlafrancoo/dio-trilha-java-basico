import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {       
        
        System.out.println("Bem vindo ao Banco DIO!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua agência:");
        int numero =Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor,digite a sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nome_cliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. ");
    }

}
