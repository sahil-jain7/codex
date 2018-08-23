//the sum of the prime below 10 is 2+3+5+7=17
//Find the sum of all the prime below two million.
class program10
{
 public static boolean isprime(int n)
 {
     int i,c=0;
     boolean flag=false;
     for(i=1;i<=Math.sqrt(n);i++)
     {
         if (n%i==0)
         {
             c++;
         }
     }
        if(c==1)
        flag=true;
        return flag;
 }
 public static void main()
 {
     int i;long sum=2;
     for(i=3;i<=2000000;i+=2)
     {
        
         
            if(isprime(i))
            {
             sum+=i;
            }
        
    }
        System.out.println("Sum of prime number="+sum);
    
}
}
             
