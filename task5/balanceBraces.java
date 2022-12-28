package task5;

import java.util.Stack;

public class balanceBraces {
//    Write a JAVA program that gives boolean
//values; true, if the string has
//balanced braces and false, if the string
//has unbalanced braces:
//For eg, => “({{)}[}]()” //output => true
////valid parenthesis
//{{( [ ) ] }} => “[})(” //output => false
////invalid parenthesis
public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    String data = "()()()()()()()()()()()()(){}{}{}{}{}{}{}{}{}{}{}{}";
    String closing= ")}]";
    String opening= "({[";
    for (int i=0; i<data.length();i++){

        if(i!=0){
            if (opening.indexOf(data.charAt(i))>=0){
                stack.push(data.charAt(i));
            }
            else {
                if (opening.indexOf(stack.peek())==closing.indexOf(data.charAt(i)))
                    stack.pop();
                else{ break;}
            }
        }
        else {
            if (closing.indexOf(data.charAt(i)) < 0)
                stack.push(data.charAt(i));
            else{ break;}
        }
    }
    if (stack.isEmpty())
        System.out.println(true);

    else
        System.out.println(false);

}
}
