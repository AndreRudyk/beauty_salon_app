package com.training.app.model.entity;

public class Card implements Entity {

    private int cardNumber;
    private double balance;
    private User user;

    public Card(int cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }

        Card card = (Card) o;

        if (getCardNumber() != card.getCardNumber()) {
            return false;
        }
        if (Double.compare(card.getBalance(), getBalance()) != 0) {
            return false;
        }
        return getUser().equals(card.getUser());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCardNumber();
        temp = Double.doubleToLongBits(getBalance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getUser().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", user=" + user +
                '}';
    }

}
