package com.training.app.model.entity;

/**
 * The type Card.
 * @author besko
 */
public class Card {

    private int cardNumber;
    private double balance;
    private User user;

    /**
     * Instantiates a new Card.
     *
     * @param cardNumber the card number
     * @param balance    the balance
     */
    public Card(int cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    /**
     * Gets card number.
     *
     * @return the card number
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets card number.
     *
     * @param cardNumber the card number
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
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
