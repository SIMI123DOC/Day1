
package Task;

import java.util.Stack;

public class UndoHistory {

    static Stack<String> history = new Stack<>();


    static void doAction(String action) {

        System.out.println("Performing: " + action);

       
        history.push(action);
    }

    
    static String undo() {

        if (history.isEmpty()) {
            return "nothing to undo";
        }

        String last = history.pop();

       
        System.out.println("Reverting: " + last);

        return "undid: " + last;
    }

    public static void main(String[] args) {

        doAction("enroll Anu");

        doAction("enroll Ravi");

        doAction("move Ravi to Batch B");

        System.out.println();

        System.out.println(undo());

        System.out.println(undo());

        System.out.println("latest kept: " + history.peek());
    }
}
