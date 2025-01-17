// Демонстрация применения статических переменных, методов и блоков.
public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        int c = 20;
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    static {
        System.out.println("Инициализация в статическом блоке.");
        b = a * 4;
    }
    public static void main(String[] args) {
        meth(42);
    }
}
