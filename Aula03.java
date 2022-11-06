public class Aula03 {
    public static void main(String[] args) {
        // Comandos de decisão em Java (IF, IF..ELSE, SWITCH e ?) - Curso de Java - Aula
        // 03

        // IF Se for verdadeiro ele executa os comandos abaixo, se não executa outros
        // comandos. Operadores: ==, >, <, >=, <=, !=, !
        // IF ELSE
        // ?
        // SWITCH

        // Tabela verdade AMD &&
        /*
         * V V = V
         * V F = F
         * F V = F
         * F F = F
         */

        // tabela verdade OR ||
        /*
         * V V = V
         * V F = V
         * F V = V
         * F F = F
         */

        int nota = 50;
        int media = 60;
        int faltas = 10;
        int maxFaltas = 5;
        String res;

        // IF

        if (nota >= media && faltas <= maxFaltas) {
            System.out.println("Aprovado!");
        }
        // IF ELSE

        if (nota >= media) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // CONDICIONAL TERNARIA ?

        System.out.println("CONDICIONAL TERNARIA: ?");
        res = (nota >= media ? "Aprovado!" : "Reprovado");
        System.out.println("Resultado: " + res);

        // SWITCH

        int pos = 1;

        switch (pos) {
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("terceiro lugar");
                break;
            default:
                System.out.println("Não subiu no pódio!");
                break;
        }

    }
}
