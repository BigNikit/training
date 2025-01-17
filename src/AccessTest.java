//В этой программе демонстрируется отличие между public и private.
class Test5 {
    int a;          // Стандартный доступ
    public int b;   // открытый доступ
    private int c;  // закрытый доступ
    // Методы доступа к c
    void sect(int i) {  // установить значение c
        c = i;
    }
    int getc() {
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();
        // Поступать так законно, т.е. к членам a и b разрешен прямой доступ.
        ob.a = 10;
        ob.b = 20;
        //Поступать так нельзя, т.к. возникнет ошибка.
        //ob.c = 100;     // Ошибка!

        //Получать доступ к члену c необходимо через его методы.
        ob.sect(100);   // Это нормально
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
