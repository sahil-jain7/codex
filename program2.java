//WAP to find the sum of even numkber of fibonacci series and the seqence should not exceed 4000000 and
//the series starting with 1 and 2.
class program2
{
 public static void main()
 {
     int sum=2,a=1,b=2,c=0;
     while(c<=4000000)
     {
         c=a+b;
         a=b;
         b=c;
         if(c%2==0)
         {
             sum+=c;
            }
        }
        System.out.println("The sum of the series ="+sum);
    }
}

         
 