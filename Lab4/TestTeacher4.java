//lab 4 Aggregation/containership composition
//date:30th August
package Lab4;

import Lab4.Address;
import Lab4.Student;
import java.util.*;
public class TestTeacher4 {
    public static void main(String[] args) {
       Address studentAddress = new Address("234 Main St", "Cityville", "Stateville");
        Student student = new Student(1, "Jane Smith", studentAddress);

        student.displayStudentInfo();


    }
}
