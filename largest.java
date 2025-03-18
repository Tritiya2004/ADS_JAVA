package Arrays;

import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr=  new int[a];
        int larg= Integer.MIN_VALUE;
        
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<a;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
        }
        int slar= Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            if(arr[i]<larg && arr[i]>slar){
                slar=arr[i];
            }
        }


        System.out.println(slar);


        sc.close();

    }
}
