// совершенствованный класс Stack, в котором
// используется член length
class Stack3 {
    private int[] stck;
    private int tos;
    // Разметить и инициализировать стек.
    Stack3(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Поместить элемент в стек.
    void push(int item) {
        if (tos == stck.length - 1)     // Используем член length
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }
    // Извлечь элемент из стека.
    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack3 {
    public static void main(String[] args) {
        Stack3 mystack1 = new Stack3(5);
        Stack3 mystack2 = new Stack3(8);
        // Поместить несколько чисел в стеки.
        for (int i=0; i<5; i++) mystack1.push(i);
        for (int i=0; i<8; i++) mystack2.push(i);
        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for (int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for (int i=0; i<8; i++)
            System.out.println(mystack2.pop());
        // Приведенные далее операторы являются недоступными.
//        mystack1.tos = -2;
//        mystack2.stck[3] = 100;
    }
}

