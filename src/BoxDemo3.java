// В этой программе внутрь класса Box добавляется метод.
class Box3 {
    double width;
    double height;
    double depth;
    // Отобразить объем коробки.
    void volime() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;
        // Присвоить значения переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // Присвоить значения переменным экземпляра mybox2.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // Отобразить объем первой коробки.
        vol = mybox1.width * mybox1.height * mybox1.depth;
        mybox1.volime();
        // Отобразить объем второй коробки.
        vol = mybox2.width * mybox2.height * mybox2.depth;
        mybox2.volime();
    }
}