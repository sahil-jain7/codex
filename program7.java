//By listing the first six prime number:2,3,5,7,11 and 13 we can see that the six prime number is 13.
//what is 10001 st prime number ?
class program7
{
 public static boolean isprime(int n)
 {
     int i,c=0;
     boolean flag=false;
     for(i=1;i<=n;i++)
     {
         if (n%i==0)
         {
             c++;
         }
     }
        if(c==2)
        flag=true;
        return flag;
 }
 public static void main()
 {
     int c=0,i=1;
     while(i>0)
     {
         if(isprime(i))
         {
             c++;
             if(c==10001)
             {
                 System.out.println("The prime number at 10001 position="+i);
                 break;
                }
            }
            i++;
        }
    }
}
     
     
     
