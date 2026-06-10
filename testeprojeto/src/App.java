import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];
        
        if (tipoConta.equals("corrente") || tipoConta.equals("poupanca") || tipoConta.equals("investimento") ){
          System.out.printf("Bem-vindo(a), %s ! Sua conta %s está pronta para uso.",nome,tipoConta);
        } else {
          System.out.println("Tipo de conta invalido.");
        }

       
        scanner.close();
    }
    }

