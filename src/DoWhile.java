// Демонстрация работы цикла do-while.
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("Импульс номер " + n);
            n--;
        } while (n > 0);
        // Можно еще вот так, более сжато:
        System.out.println("##########");
        n = 10;
        do {
           System.out.println("Импульс номер " + n);
        } while (--n > 0);
    }
}