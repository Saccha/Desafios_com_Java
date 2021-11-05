import java.util.Stack;
import java.util.Scanner;

class ParenthesisBalance {
    public static String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0){
            return "incorrect";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return "incorrect";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "correct";

        } else {
            return "incorrect";
        }
    }
}

public class TESTE_2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ParenthesisBalance checker = new ParenthesisBalance();

        while (leitor.hasNext()) {
            var line = leitor.next();
            System.out.println(checker.solution(line));
        }

        leitor.close();
    }
}
