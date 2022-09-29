import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[])  throws Exception {

        Stack stack = new Stack();

        Scanner scanner = new Scanner(System.in);

        System.out.println("input parentheses");
        String input = scanner.nextLine();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '('){
                stack.push("ooga");
            }else if(input.charAt(i) == ')'){
                if (stack.peek() != null){
                    stack.pop();
                }else{
                    System.out.println("too many )");
                }
            }
        }

        if (stack.peek() == null){
            System.out.println("you have the correct amount of parentheses ");
        } else if(stack.peek() != null){
            System.out.println("you have too many (");
        }else {
            System.out.println("this should not be called or else there is a problem");
        }
    }
}
