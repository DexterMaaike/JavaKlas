package nl.duo.javaklasje.dag1;

public class TableApplication {
    public static void main(String[] args) {
        int[][] tables = new int[11][11];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                tables[i][j] = i * j;
            }
        }
        for (int[] producten : tables) {
            for (int product : producten) {
                System.out.println(product);
            }
        }
    }
}
