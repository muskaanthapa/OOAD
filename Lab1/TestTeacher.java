//lab1 java fundamentals(oop basics)
//date:2023/08/24
package Lab1;

import java.util.*;
//import lab1.Teacher;
public class TestTeacher {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter teacherID, fullName, email, salary ");
        int teacherID = ob.nextInt();
        String fullName = ob.next();
         String email = ob.next();
        double salary = ob.nextDouble();
    
        Teacher t = new Teacher(teacherID, fullName, email, salary);
        t.setTeacherID(teacherID);
        t.setFullName(fullName);
        t.setEmail(email);
        t.setSalary(salary);
        System.out.println("Id:" + t.getTeacherID());
        System.out.println("Fullname:" + t.getFullName());
        System.out.println("Email:" + t.getEmail());
        System.out.println("Salary:" + t.getSalary());
    }
}