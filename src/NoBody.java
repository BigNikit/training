// Тело цикла может быть пустым.
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;
        // Найти среднюю точку между i и j
        while (++i < --j); // тело в цикле отсутствует
        System.out.println("Средняя точка равна " + i);
    }
}
