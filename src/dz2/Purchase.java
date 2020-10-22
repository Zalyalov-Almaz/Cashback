package dz2;

public class Purchase {
    int summ;
    private int cashbackPercent;
    private int cashback;

    public Purchase(int summ, int cashbackPercent) {
        this.summ = summ;
        if (cashbackPercent == 1 || cashbackPercent == 5 || cashbackPercent == 30) {
            this.cashbackPercent = cashbackPercent;
        }
        this.cashback += this.summ * this.cashbackPercent/100;
        if (cashback >= 3000) {
            cashback = 3000;
        }
    }

    public int getCashback() {
        System.out.println(this.cashback);
        return this.cashback;
    }
}