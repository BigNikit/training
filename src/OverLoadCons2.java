// Здесь класс Box позволяет один объект инициализировать другим.
class Box9 {
    double width;
    double height;
    double depth;
    // Обратите внимание на этот конструктор, который принимает объект типа Box.
    Box9(Box9 ob) {     // Передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Конструктор, используемый в случае указания всех трех размеров.
    Box9(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, применяемый в случае, если размеры коробки вообще не указаны.
    Box9() {
        width = -1;     // Использовать -1 для обозначения
        height = -1;    // неинициализированного
        depth = -1;     // объекта коробки
    }
    // Конструктор, применяемый в случае создания объекта кубика.
    Box9(double len) {
        width = height = depth = len;
    }
    // Вычислить и возвратить объем.
    double volime() {
        return width * height * depth;
    }
}
public class OverLoadCons2 {
    public static void main(String[] args) {
        // Создать объекты коробок с применением различных конструкторов.
        Box9 mybox1 = new Box9(10, 20, 15);
        Box9 mybox2 = new Box9();
        Box9 mycube = new Box9(7);
        Box9 myclone = new Box9(mybox1); // создать копию объекта mybox1
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

        // Вычислить объем копии.
        vol = myclone.volime();
        System.out.println("объем копии равен " + vol);
    }
}