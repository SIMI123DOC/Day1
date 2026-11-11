
package Task;

import java.util.ArrayList;

public class EnrollmentList {

    static int capacity = 4;

    static ArrayList<String> enrolled = new ArrayList<>();

    
    static String enroll(String name) {

        if (enrolled.size() < capacity) {

            enrolled.add(name);

            return name + " enrolled";
        }

        return "batch full";
    }

 
    static void drop(String name) {

        enrolled.remove(name);
    }

    public static void main(String[] args) {

        String[] students = {
            "Anu", "Ravi", "Meena", "John", "Sara"
        };

        for (String name : students) {

            System.out.println(enroll(name));
        }

    
        drop("Ravi");

      
        System.out.println(enrolled);

       
        System.out.println("seat 1: " + enrolled.get(0));
    }
}
