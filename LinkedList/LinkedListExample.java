import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        // Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // 1. Add elements
        animals.add("Dog");       // Adds to the end
        animals.add("Cat");       // Adds to the end
        animals.add("Horse");     // Adds to the end

        System.out.println("LinkedList: " + animals);

        // 2. Add to the beginning or end
        animals.addFirst("Eagle"); // Adds to the start
        animals.addLast("Tiger");  // Adds to the end

        System.out.println("After adding first/last: " + animals);

        // 3. Remove elements
        animals.removeFirst(); // Removes "Eagle"
        animals.remove(1);     // Removes "Cat" (at index 1)

        System.out.println("After removing: " + animals);

        // 4. Access elements (less common)
        String firstAnimal = animals.getFirst(); // Gets "Dog"
        String lastAnimal = animals.getLast();   // Gets "Tiger"

        System.out.println("First: " + firstAnimal + ", Last: " + lastAnimal);
    }
}
