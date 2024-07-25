public class MultiplicationTable {

    public static String[] generateTable(int n) {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return table;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int n = 5;
        String[] result = generateTable(n);
        for (String line : result) {
            System.out.println(line);
        }
    }
}
