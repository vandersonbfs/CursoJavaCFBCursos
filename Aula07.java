import java.util.Arrays;

public class Aula07 {
    public static void main(String[] args) {
        // Métodos da classe Array em Java - Curso de Java - Aula 07

        int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d - ", num[i]);
        }

        // Tem o FOR especial para leitura de Array

        for (int n : num) {
            System.out.printf("%nTem o FOR especial para leitura de Array: %d", n);
        }

        // Metodo Sort para ordenação dos elementos do Array:
        Arrays.sort(num);
        for (int n : num) {
            System.out.printf("%nMetodo Sort para ordenação dos elementos do Array: %d", n);
        }

    }
}
