/**
 * Desarollo del punto 2.1 (codingbat)
 */
public class Recursion1
{
    public int factorial(int n) {
        if(n==0)
        {
            return 1;
        }else return n*factorial(n-1);
    }

    public int bunnyEars(int bunnies) {
        if(bunnies==0)
        {
            return 0;
        }
        else return 2+bunnyEars(bunnies-1);
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies==0)
        {
            return 0;
        }
        if(bunnies%2!=0)
        {
            return 2+bunnyEars2(bunnies-1);
        }
        else return 3+bunnyEars2(bunnies-1);
    }

    public int sumDigits(int n) {
        if(n == 0)
        {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public int powerN(int base, int n) {
        if(n<=1)
        {
            return base;
        }
        else return base*powerN(base,n-1);
    }

}
