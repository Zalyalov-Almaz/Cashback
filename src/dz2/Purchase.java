package dz2;

public class Purchase {
    int summ;
    private int cashbackPercent;
    private static int cashback;

    public Purchase(int summ, int cashbackPercent) {
        this.summ = summ;
        if (cashbackPercent == 1 || cashbackPercent == 5 || cashbackPercent == 30) {
            this.cashbackPercent = cashbackPercent;
        }
        cashback += this.summ * this.cashbackPercent/100;
        if (cashback >= 3000) {
            cashback = 3000;
        }
    }

    public static int getCashback() {
        System.out.println(cashback);
        return cashback;
    }
}