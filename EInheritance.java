class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();     // inherited method
        obj.display();  // child’s own method
    }
}
