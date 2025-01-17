// Определение внутреннего класса в пределах цикла for.
class Outer2 {
    int Outer2_x = 100;
    // так нельзя, как минимум потому что метод Inner() находится в блоке кода.
    // Inner inner_test = new Inner();
    void test() {
        for (int i = 0; i < 10; i++) {
            int n = i;
            class Inner {
                void display() {
                    System.out.println("display(): outer2_x = " + Outer2_x + " счетчик равен " + n);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test();
    }
}
