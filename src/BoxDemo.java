/* Программа, в которой используется класс Box.
   Назовите этот файл BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;
}
// В этом классе объявляется объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // Присвоить значения переменным экземпляра mybox.
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // Вычислить объем коробки.
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("объем равен " + vol);
    }
}
