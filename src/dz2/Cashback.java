package dz2;

public class Cashback {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase(750, 5);
        purchase1.getCashback();
        Purchase purchase2 = new Purchase(4500, 1);
        purchase2.getCashback();
        Purchase purchase3 = new Purchase(60000, 30);
        purchase3.getCashback();
    }
}
