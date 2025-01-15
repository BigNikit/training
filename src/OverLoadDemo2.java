// При перегрузке применяется автоматическое преобразование типов.
public class OverLoadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }
    // Перегрузить test() для двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // Перегрузить test() для одного параметра типа double.
    void test(double a) {
        System.out.println("Внутри test(double) a: " + a);
    }
}

class OverLoad2 {
    public static void main(String[] args) {
        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);     // будет вызываться test(double)
        ob.test(123.2);     // будет вызываться test(double)
    }
}