public class swastiktower {
    /*
     //you are given a three rods and disc stacked in one rode in
     an increasing order od size from top to bottom

     only one disc can be moved at a time
     a larger disc cannot be placed on a smaller disc
     u can use three rods../

     resursive  formula=T(N)=2T(N-1)+1;
     T(1)=1;
     time com=O(2^n)
     space com=0(n)

     //Move n-1 disc from source to auxillary()
     move the nth disc directlt from source to destination
     move n-1 disc from auxillary to destination(source helper)
     
     */

     public static void main(String[] args) {
        int n=4;
        sH(n, 'A', 'B','C');
     }

     public static void sH(int n, char sou, char aux, char dest){
        if(n==1){
            System.out.println("Move disc 1 from" +sou+" to "+dest);
            return;
        }
        sH(n-1,sou,dest,aux);
        System.out.println("move disc "+n+"from "+sou+"to"+dest);
        sH(n-1,aux,sou,dest);
     }
    
    
}
   