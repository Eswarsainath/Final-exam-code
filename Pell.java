package pell;

public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        if(n<=2)
            return n;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i =3;i<=n;i++)
        {
            dp[i] = 2*dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        Pell pell = new Pell();
        System.out.println(pell.get(n));
    }
}
