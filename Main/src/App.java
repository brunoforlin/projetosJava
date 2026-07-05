import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var option = -1;

        do {
            System.out.println("escolha uma das opçoes");
            System.out.println("1 - dar banho no pet");
            System.out.println("2 - abastecer a maquina com agua");
            System.out.println("3 - abastecer a maquina com shampoo");
            System.out.println("4 - verifica agua na maquina");
            System.out.println("5 - verifica shampoo na maquina");
            System.out.println("6 - verifica se tem pet no banho");
            System.out.println("7 - colocar o pet na maquina");
            System.out.println("8 - retirar o pet da maquina");
            System.out.println("9 - limpar a maquina");
            System.out.println("0 - sair");
        } while (option !=0)
    }
}
