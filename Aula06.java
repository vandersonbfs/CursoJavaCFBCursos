public class Aula06 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Arrays
        int[] num = new int[5];
        // Inserindo valores
        // int[] numeros = { 10, 20, 30, 40, 50 };

        num[0] = 10;
        num[1] = 12;
        num[2] = 15;
        num[3] = 8;
        num[4] = 19;
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d  ", num[i]);
        }

    }
}
