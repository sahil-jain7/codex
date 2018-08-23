//a pythagorean triplet is a set of three natural number,a<b<c,for which,
//a*a + b*b= c*c
//for example 3*3+4*4=25.
//there exist exactly one pythagorean triplet fot which a+b+c=1000.Find the product of abc.
class program9
{
    public static void main()
    {
        int i,j,a,b,p=1;
        for(i=1;i<1000-1;i++)
        {
            for(j=(i+1);j<1000;j++)
            {
                a=i;
                b=j;
                double csquare = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.pow(csquare, 0.5);
                if (a + b + c == 1000)
                {
                    System.out.println((int)(a * b * c));
                    break;
                }
            }
        }

    }
}

