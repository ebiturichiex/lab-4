//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //call to the function
        system.out.printin(pow(2.0, 10));
        public static double pow ( double x, int n):
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return pow(1 / x, -n);
        } else if n % 2 == 0: //n is even
        double half = pow(x, n / 2);
        return half * half;
        } else: n is odd
                return x* pow(x,n-1);
        }
    }
}