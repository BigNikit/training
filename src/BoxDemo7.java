// Здесь в Box используется параметризованный конструктор
// для инициализации размеров коробки.
class Box7 {
    double width;
    double height;
    double depth;
    // Это конструктор для Box.
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Вычислить и возвратить объем.
    double volime() {
        return width * height * depth;
    }
}
public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);
        double vol;
        // Получить объем первой коробки.
        vol = mybox1.volime();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки.
        vol = mybox2.volime();
        System.out.println("Объем равен " + vol);
    }
}