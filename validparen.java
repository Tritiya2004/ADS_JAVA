import java.util.*;

public class validparen {
    /*
     *given a string containing only chars (,),{,},[,]
     determine if the input is valid or not
     */

     public static boolean isVal(String s){
        Stack<Character> stack= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')'&& top!='(')|| 
                (ch==']'&& top!='[')|| 
                (ch=='}'&& top!='{')){
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
     }
     public static void main(String[] args) {
        String str="(){}}{";
        System.out.println(isVal(str));
     }
}
