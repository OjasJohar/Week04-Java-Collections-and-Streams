package reflection.intermediate_level.retrieve_annotations_at_runtime;

// Step 3: Retrieve and display annotation value at runtime
public class AnnotationDemo_06 {
    public static void main(String[] args) {
        // Get class object
        Class<MyClass> obj = MyClass.class;

        // Check if @Author annotation is present
        if (obj.isAnnotationPresent(Author.class)) {
            // Retrieve the annotation
            Author annotation = obj.getAnnotation(Author.class);

            // Display the annotation value
            System.out.println("Author Name: " + annotation.name());
        } else {
            System.out.println("No @Author annotation present.");
        }
    }
}
