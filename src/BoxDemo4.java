// Теперь volume() возвращает объем коробки.
class Box4 {
    double width;
    double height;
    double depth;
    // Отобразить объем коробки.
    double volime() {
        return width * height * depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;
        // Присвоить значения переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // Присвоить значения переменным экземпляра mybox2.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // Получить объем первой коробки.
        vol = mybox1.volime();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки.
        vol = mybox2.volime();
        System.out.println("Объем равен " + vol);
    }
}