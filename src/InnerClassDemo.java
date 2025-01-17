// Демонстрация работы с внутренним классом.
class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // Внутренний класс.
    class Inner {
        int y = 10;
        void display() {
            System.out.println("display(): outer_x = " + outer_x);
        }
    }
    // Так нельзя будет ошибка, переменная y недоступна, т.к. она во внутреннем классе.
//    void showy() {
//        System.out.println("showy(): y = " + y);
//    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
