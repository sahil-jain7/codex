

 //wap to print the largest prime factorisation of number 600851475143
 public class program3
{
  public static void main()
  {
     int i,max=0;
      long n=600851475143L;
      while(n>1)
      {
          for(i=2;i<=n;i++)
          {
              if(n%i==0)
              {
                  if(max<i)
                  {
                      max=i;
                  }
                  break;
              }
          }
          n=n/i;
      }
        System.out.println("The maximum prime factor="+max);
    }
}

        
                    
                      
                     