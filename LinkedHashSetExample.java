import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate elements are not allowed

        // Display the elements in the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element is present
        String searchElement = "Banana";
        if (linkedHashSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the LinkedHashSet.");
        } else {
            System.out.println(searchElement + " is not present in the LinkedHashSet.");
        }

        // Remove an element
        String elementToRemove = "Orange";
        linkedHashSet.remove(elementToRemove);
        System.out.println("After removing " + elementToRemove + ": " + linkedHashSet);

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}