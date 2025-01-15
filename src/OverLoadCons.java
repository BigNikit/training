// Здесь в Box определены три конструктора для инициализации
// размеров объектов коробки различными способами.
class Box8 {
    double width;
    double height;
    double depth;
    // Конструктор, используемый в случае указания всех трех размеров.
    Box8(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, применяемый в случае, если размеры коробки вообще не указаны.
    Box8() {
        width = -1;     // Использовать -1 для обозначения
        height = -1;    // неинициализированного
        depth = -1;     // объекта коробки
    }
    // Конструктор, применяемый в случае создания объекта кубика.
    Box8(double len) {
        width = height = depth = len;
    }
    // Вычислить и возвратить объем.
    double volime() {
        return width * height * depth;
    }
}
public class OverLoadCons {
    public static void main(String[] args) {
        // Создать объекты коробок с применением различных конструкторов.
        Box8 mybox1 = new Box8(10, 20, 15);
        Box8 mybox2 = new Box8();
        Box8 mycube = new Box8(7);
        double vol;

        // Вычислить объем первой коробки.
        vol = mybox1.volime();
        System.out.println("объем mybox1 равен " + vol);

        // Вычислить второй первой коробки.
        vol = mybox2.volime();
        System.out.println("объем mybox2 равен " + vol);

        // Вычислить объем кубика.
        vol = mycube.volime();
        System.out.println("объем mycube равен " + vol);
    }
}