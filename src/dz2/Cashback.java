package dz2;

public class Cashback {

    public static int cashback;

}

class Purchase {
    int summ;
    private int cashbackPercent;

    public Purchase(int summ, int cashbackPercent) {
        this.summ = summ;
        this.cashbackPercent = cashbackPercent;
        Cashback.cashback = this.summ * this.cashbackPercent/100;
        if (Cashback.cashback >= 3000) {
            Cashback.cashback = 3000;
        }
    }
}

class Test {

    public static void main(String[] args) {
        Purchase p = new Purchase(500, 1);
        System.out.println(Cashback.cashback);
        Purchase p2 = new Purchase(1500, 5);
        System.out.println(Cashback.cashback);
        Purchase p3 = new Purchase(60000, 30);
        System.out.println(Cashback.cashback);
    }
}
