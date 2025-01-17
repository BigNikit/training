// Использование массива для передачи методу произвольного числа аргументов.
// Это подход в старом стиле к аргументам переменной длины.
public class PassArray {
    static void vsTest(int[] v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Обратите внимание на то, как должен создаваться
        // массив для хранения аргументов.
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = { };

        vsTest(n1);     // 1 аргумент
        vsTest(n2);     // 3 аргумента
        vsTest(n3);     // без аргументов
    }
}
