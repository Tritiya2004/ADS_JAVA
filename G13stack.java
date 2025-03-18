import java.util.LinkedList;
import java.util.Stack;

public class G13stack {
    /*
     what is stack
     a stack is lastin first out data structure 
     meaning the last element addded is the one which removed first
     push
     pop
     .size()
     peep - top element

     */
    public static void main(String[] args) {
        Stack<Object> n=new Stack<>();
        n.push(1);
        n.push("neeraj");
        n.push(2345678);
        System.out.println(n);

        System.out.println(n.peek());
        n.pop();
        System.out.println(n);
        LinkedList<Object> no= new LinkedList<>();
        no.add(1);
        no.add(34);
        System.out.println(no);
        no.removeLast();
        System.out.println(no);

    }
    
}
