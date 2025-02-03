public class PrimeSeiveUnderSet {
    public static void main(String[] args) {
        /*
         what is a prime sieve ?
         is an algo to efficiently generate all the prime
         numbers up to a specified limit N

         STEPS:
         1.create array boolean type... where each index represents that wether its
         prime or not
         2.initially mark all ele no. from 2 to n as true 
         3.
         -starting from first prime 2 mark all multiples of 2 as false
         -move to next no. and now mark all its  multiple false

         we move till n*n but WHY???...
         -continue this until u reach ...square root of n ..

         */
        int n=100;
        //sieve(n);

        int l=10;
        int r=30;
        System.out.println(countP(l,r));
    }

    public static void sieve (int n){
        boolean[] isPrime =new boolean[n+1];

        for(int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p+p;i<=n;i=i+p){
                    isPrime[i]=false;
                }
            }
        }
        System.out.println("prime numbers upto "+n);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
            }
        }

        }
       

        ///when both limits given............

        public static int countP(int l, int r){
            int[] prime=new int[r+1];

            for(int i=0;i<=r;i++){
                prime[i]=1;
            }

            prime[0]=prime[1]=0;
            for(int i=2;i*i<=r;i++){
                if(prime[i]==1){
                    for(int j=i*i;j<=r;j=j+i){
                        prime[j]=0;
                    }
                }
            }
            int count =0;
            for(int i=l;i<=r;i++){
                if(prime[i]==1){
                    count++;
                }
            }
            return count;
        }

}
