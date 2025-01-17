// Использование аргументоа переменной длины со стандартными аргументами.
public class VarArgs2 {
    // Здесь msg является нормальным параметром, а y - параметром переменной длины.
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest("Один аргумент переменной длины: ", 10);         // 1 аргумент
        vaTest("Три аргумента переменной длины: ",1, 2, 3);    // 3 аргумента
        vaTest("Без аргументов переменной длины: ");               // без аргументов
    }
}