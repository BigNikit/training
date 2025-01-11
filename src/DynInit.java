// Демонстрация использования динамической инициализации.
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        //Переменная c инициализируется динамически.
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Длина гипотенузы равна " + c);
    }
}
