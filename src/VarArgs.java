// Демонстрация использования аргументов переменной длины.
public class VarArgs {
    // vaTest() сейчас использует vararg.
    static void vaTest(int ... v) {
        System.out.println("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Обратите внимание, что теперь метод vaTest()
        // можно вызывать с переменным числом аргументов
        vaTest(10);         // 1 аргумент
        vaTest(1, 2, 3);    // 3 аргумента
        vaTest();               // без аргументов
    }
}
