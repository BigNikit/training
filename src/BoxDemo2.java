// В этой программе объявляются два объекта Box
class Box2 {
    double width;
    double height;
    double depth;
}
public class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;
        // Присвоить значения переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // Присвоить значения переменным экземпляра mybox2.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // Вычислить объем первой коробки.
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("объем равен " + vol);
        // Вычислить объем второй коробки.
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("объем равен " + vol);
    }
}