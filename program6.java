//Find the difference between the sum of the squares of the first one hundread natural number 
//and the square of the sum.
class program6
{
 public static void main()
 {
     int s1=0,s2=0,sum,i,dif,p=1;
     for(i=1;i<=100;i++)
     {
         s1=s1+i*i;
         s2=s2+i;
        }
        p=s2*s2;
        dif=p-s1;
        System.out.println("The difference="+dif);
    }
}


