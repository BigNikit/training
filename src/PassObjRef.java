// Объекты передаются через ссылки на них
class Test3 {
    int a, b;
    Test3(int i, int j) {
        a = i;
        b = j;
    }
    // Передать объект.
    void meth2(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class PassObjRef {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
        ob.meth2(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}