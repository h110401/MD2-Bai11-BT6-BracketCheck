import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        boolean well = bracketCheck(string);
        System.out.println(well);
    }

    public static boolean bracketCheck(String string) {
        String[] split = string.split("");
        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if (s.equals("("))
                stack.push(s);
            if (s.equals(")")) {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}


