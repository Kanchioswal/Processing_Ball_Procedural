public class Factorial {

    private int num;

    public Factorial(int num) {

        this.num=num;

    }

    public int check(int n) {
        int fact=1;
        if(n==1)
        {
            return fact;
        }
        else {
            for (int a = 2; a <= n; a++) {
                fact = fact * a;

            }
            return fact;
        }
    }
}
