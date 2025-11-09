class Student {
    String name;
    int age;

    void showInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Naim";
        s.age = 18;
        s.showInfo();
    }
}
