class Solution {
    public double myPow(double x, int n) {
        return n < 0 ? 1 / calculate(x, (long) Math.abs(n)) : calculate(x, (long) n);
    }

    private double calculate(double x, long n) {
        if (n == 0) return 1;
        double temp = calculate(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0)
            return temp;
        else return temp * x;
    }
}