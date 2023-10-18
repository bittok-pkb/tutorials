import java.util.ArrayList;
import java.util.List;

public class DeepShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");

        Student originalStudent = new Student("Alice", subjects);

        // Shallow copy
        Student shallowCopyStudent = originalStudent;
        shallowCopyStudent.getSubjects().add("History");

        // Deep copy
        Student deepCopyStudent = (Student) originalStudent.clone();
        deepCopyStudent.getSubjects().add("English");

        // Original student's subjects
        System.out.println("Original Student's Subjects: " + originalStudent.getSubjects()); // [Math, Science, History]

        // Shallow copy student's subjects (same reference)
        System.out.println("Shallow Copy Student's Subjects: " + shallowCopyStudent.getSubjects()); // [Math, Science, History]

        // Deep copy student's subjects (separate copy)
        System.out.println("Deep Copy Student's Subjects: " + deepCopyStudent.getSubjects()); // [Math, Science, English]
    }
}
/*Output:
Original Student's Subjects: [Math, Science, History]
Shallow Copy Student's Subjects: [Math, Science, History]
Deep Copy Student's Subjects: [Math, Science, History, English]
 */
