//find the sum of all the multiple of 3 or 5 below 1000
class program1
{
 public static void main()
 {
     int sum=0,i;
     for(i=1;i<1000;i++)
     {
         if(i%3==0||i%5==0)
           {
             sum+=i;
           }
        }
      System.out.println("the sum of multiple of 3 or 5 ="+sum);
    }
}
            
