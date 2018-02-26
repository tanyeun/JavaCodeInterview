import java.util.Arrays;

public class Karatsuba {
    // x = 10^(n/2) a + b
    // y = 10^(n/2) c + d
    // x * y = 10^n ac + 10^(n/2)(ad + bc) + bd
    // Note that:
    //   sumMul - ac - bd = ad + bc
    //   where sumMul = (a+b)(c+d)
    public static int mul(int x, int y){
        if( x <= 10 && y <= 10 ){
            return x*y;
        }

        // digits : longer length of x, y
        int digits = numlength(x) > numlength(y) ? numlength(x) : numlength(y);

        int sub = digits / 2;
        int sub10 = (int) Math.pow(10, sub);

        int a = x / sub10; int b = x % sub10;
        int c = y / sub10; int d = y % sub10;

        int ac = mul(a,c);
        int bd = mul(b,d);
        int sumMul = mul(a+b,c+d);
        int mid = sumMul - ac - bd;

        return ac*sub10*sub10 + mid*sub10 + bd;
    }

    private static int numlength(int n)
    {
        if (n == 0) return 1;
        int l;
        n=Math.abs(n);
        for (l=0;n>0;++l)
            n/=10;
        return l;
    }
}
