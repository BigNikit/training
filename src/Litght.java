// Рассчитать расстояние, проходимое светом.
// С применением переменных типа long.
public class Litght {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // Приблизительная скорость света в милях за секунду
        lightspeed = 186000;
        days = 1000;                        // Указать колличество дней
        seconds = days * 24 * 60 * 60;      // преобразовать в секунды
        distance = lightspeed * seconds;    // Расчитать расстояние
        // Вывести примерное расстояние в милях, проходимое светом
        // за указанное колличество дней.
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
