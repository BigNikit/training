// Использование continue с меткой.
public class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();

        // Личный тест break
        boolean r = true;
        int b = 0;
        outlab: while (r) {
            System.out.print("тест" + b + ", ");
            if(b > 10) break outlab;
            b++;
        }
        System.out.println("\nКонец личного теста break");
    }
}
