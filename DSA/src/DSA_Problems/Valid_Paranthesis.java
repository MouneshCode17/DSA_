package DSA_Problems;

import java.util.*;

class ValidParenthesis{
    public static boolean isValid(String str){

        if(str.length()%2!=0) return false;
        Map<Character,Character> hash= Map.of('(',')','[',']','{','}');
                    Stack<Character> stack=new Stack<>();
                    for(int i=0;i<str.length();i++){
                        if(str.charAt(i)=='{' || str.charAt(i) =='[' || str.charAt(i) == '(') stack.push(str.charAt(i));
                    }
                    System.out.println(stack);
                    for(int i=str.length()-1;i>=0;i--){
                        if(str.charAt(i)=='}' || str.charAt(i) ==']' || str.charAt(i) == ')'){
                            if(hash.get(stack.peek())==str.charAt(i)) {
                                stack.pop();
                                System.out.println(stack);
                }
            }
        }

    return stack.isEmpty();
    }
}
public class Valid_Paranthesis {
    public static void main(String[] args) {
        int[] a= {1,2,3};
        int[] b=a;
        a[0]=999;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        boolean val=ValidParenthesis.isValid("()[]{}");
       // boolean  val=ValidParenthesis.isValid("{[}]");
        System.out.println(val);
       List <Integer> list =  new ArrayList<>();


    }
}
