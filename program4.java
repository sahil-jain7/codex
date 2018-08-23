//A PALINDROM NUMBER READ THE SAME BOTH THE WAYS.
//the largest palindrom made from the product of two digit number is 9009=91*99.
//find the largest palindrom made from the product of two 3-digit number.
class program4
{
 public static  boolean ispalin(int n)
{
int rem=0,rev=0,a=n;
boolean flag=false;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==a)
flag=true;
return flag;
}
 public static void main()
 {
  int i=999,j=999,n=1,max=0,a=0,b=0;
 for(i=999;i>=100;i--)
 {
    for(j=999;j>=100;j--)
    {
          n=i*j;
          
        if(ispalin(n)==true)
        {
           if(max<n)
           {
            max=n;
            a=i;
            b=j;
           }
        }
    }
}
System.out.println("The palindrome number is"+max+"="+a+"*"+b);     
 }
}





