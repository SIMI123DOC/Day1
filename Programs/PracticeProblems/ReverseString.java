package Programs.PracticeProblems;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str = "my name is asha";

        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

      
        String result = "";

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + result);
    }
}