import java.util.Scanner;

public class Desafio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String tipoCofre = scanner.nextLine();

            if (tipoCofre.equalsIgnoreCase("digital")) {

                int senha = scanner.nextInt();
                int confirmacaoSenha = scanner.nextInt();

                CofreDigital cofre = new CofreDigital(senha);
                boolean senhaValida = cofre.validarSenha(confirmacaoSenha);

                cofre.imprimirInformacoes();

                if (senhaValida){
                    System.out.println("Cofre aberto!");
                }
                else{
                    System.out.println("Senha incorreta!");
                }
            }
            else {
                CofreFisico cofre = new CofreFisico();
                cofre.imprimirInformacoes();
            }

            scanner.close();
        }
}
