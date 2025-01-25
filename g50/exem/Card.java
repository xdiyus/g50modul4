package exem;

public class Card {

    private String cardNumber;
    private double balance;
    private boolean blocked;


    public Card(double balance, boolean blocked, String cardNumber) {
        this.balance = balance;
        this.blocked = blocked;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public static boolean checkBalance(Card card, double amount) throws InterruptedException {
        System.out.println("Pul yetarlimi? ");
        Thread.sleep(1500);
        return card.getBalance() >= amount;
    }


    public static boolean checkBlocked(Card card) throws InterruptedException {
        System.out.println("Carda blocklanmaganmi? ");
        Thread.sleep(1500);
        return !card.isBlocked();
    }

    public static void transfer(Card fromCard, Card toCard, double amount) throws InterruptedException {
        System.out.println("Perevod...");
        if (!checkBalance(fromCard, amount)) {
            System.out.println("Balansta pul yetmayapti! " + fromCard.getCardNumber());
            return;
        }

        if (!checkBlocked(toCard)) {
            System.out.println("Carda blocklangan: " + toCard.getCardNumber());
            return;
        }

        System.out.println("Pul otvoti ");
        Thread.sleep(2500);
        fromCard.setBalance(fromCard.getBalance() - amount);
        toCard.setBalance(toCard.getBalance() + amount);
        System.out.println("Perevod qilindi");
        System.out.println("Yangi balance from cardigi " + fromCard.getBalance());
        System.out.println("yangi balance to cardigi: " + toCard.getBalance());
    }


    public static void main(String[] args) throws InterruptedException {
        Card card1 = new Card(1000.0, false, "1234-5678-9012-3456");
        Card card2 = new Card(500.0, false, "9876-5432-1098-7654");

        double transferAmount = 300.0;
        transfer(card1, card2, transferAmount);
    }

}
