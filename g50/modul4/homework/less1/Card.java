package modul4.homework.less1;

public class Card {

    private String cardNumber;
    private double balance;
    private boolean blocked;

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

    public Card(double balance, boolean blocked, String cardNumber) {
        this.balance = balance;
        this.blocked = blocked;
        this.cardNumber = cardNumber;
    }






}
