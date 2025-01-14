// В этой программе используется параметризованный метод.
class Box5 {
    double width;
    double height;
    double depth;
    // Вычислить и возвратить объем.
    double volime() {
        return width * height * depth;
    }
    // Установить размер коробки
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;
        // Инициализируем размеры коробок.
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // Получить объем первой коробки.
        vol = mybox1.volime();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки.
        vol = mybox2.volime();
        System.out.println("Объем равен " + vol);
        // А можно еще вот так, более эффективно будет:
        System.out.println("");
        System.out.println("Объем равен " + mybox1.volime());
        System.out.println("Объем равен " + mybox2.volime());
    }
}