import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {

        // Criar um objeto do tipo scanner. importando a classe scanner

        // Cria o leitor
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int n1 = 0, n2 = 0, res = 0;
        String nome = "";

        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite um número:");
        n1 = scan.nextInt();
        System.out.println("Digite outro número:");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("%s, a soma de %d com %d é igual a %d", nome, n1, n2, res);
        scan.close();

    }
}
