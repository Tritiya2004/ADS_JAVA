import java.util.*;
public class g13prob{
    /*
    given a string s
    substring without repeating char
    s='abcabsbb'
    approach sliding window and hashset

    use two pointers (left and right to dine the window )
    use hashset to track char in curr window 
    expand right until we find a duplicate char
    when duplicate is found, shrink left until the substring becomes vald

    */

   public static int lenlongsub(String s){
    Set<Character> set= new HashSet<>();
    int le=0,maxen=0;
    for(int ri=0;ri<s.length();ri++){
        while(set.contains(s.charAt(ri))){
            set.remove(s.charAt(le));
            le++;
        }
        set.add(s.charAt(ri));
        maxen=Math.max(maxen,ri-le+1);
    }
    return maxen;
   }
   public static void main(String[] args){
    System.out.println(lenlongsub("abcabcbb"));
   }
}