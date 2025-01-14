// Здесь в Box используется конструктор
// для инициализации размеров коробки.
class Box6 {
    double width;
    double height;
    double depth;
    // Это конструктор для Box.
    Box6() {
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    // Вычислить и возвратить объем.
    double volime() {
        return width * height * depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;
        // Получить объем первой коробки.
        vol = mybox1.volime();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки.
        vol = mybox2.volime();
        System.out.println("Объем равен " + vol);
    }
}