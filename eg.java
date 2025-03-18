import java.util.*;
public class eg {
    public static void main(String[] args) {
        String s="Hello World GFG Welcomes You";
        
         System.out.println(shift(s));

        
    }
    public static String shift(String s){
         
        String[] c=s.split(" ");
        StringBuilder sb= new StringBuilder();
        int len=c.length;

        sb.append(c[len-1]).append(" ");

        for(int i=len-2;i>0;i--){
            String g=rev(c[i]);

            sb.append(g);

            sb.append(" ");

        }
        sb.append(c[0]).append(" ");
        return sb.toString();
    }

    public static String rev(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }
}
