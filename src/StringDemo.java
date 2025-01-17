// Демонстрация работы с объектами String.
public class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1 + " и " + strOb2;
        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);

        // Личный тест, вроде нельзя изменять объект типа String.
        strOb1 = "Тест";
        // Как я понял - здесь переменной strOb1 был присвоен новый объект типа String. Может в младших версиях java это не так...
        System.out.println(strOb1);
    }
}
