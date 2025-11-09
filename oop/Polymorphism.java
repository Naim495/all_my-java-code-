class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area = πr²");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
