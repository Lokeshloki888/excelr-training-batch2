import java.util.LinkedHashSet;

public class demo033 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of type Integer
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("LinkedHashSet contains: " + numbers);
    }
}
