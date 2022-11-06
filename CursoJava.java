public class CursoJava {
    public static void main(String[] args) {
        /*
         * Aula 02 comandos de saida:
         * 
         */

        System.out.print("CFB Curso\n");
        System.out.println("Curso de Java.");

        /*
         * Printf:
         * Comandos de formatação
         * String %s
         * Inteiro %d
         */
        System.out.printf("%s - %d", "CFB Cursos", 2021);
        System.out.printf("\nCanal: %s - Ano: %d", "CFB Cursos", 2021);

        int num = 100;
        String nome = "Vanderson";

        System.out.printf("O valor de num: %d %nNome %s", num, nome);

    }
}
