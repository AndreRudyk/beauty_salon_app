package com.training.app.model.entity;

import java.math.BigDecimal;

/**
 * The type Card.
 */
public class Card {

    private int id;
    private String cardNumber;
    private BigDecimal balance;
    private User user;

    /**
     * Instantiates a new Card.
     */
    public Card() {
    }

    /**
     * Instantiates a new Card.
     *
     * @param id         the id
     * @param cardNumber the card number
     * @param balance    the balance
     */
    public Card(int id, String cardNumber, BigDecimal balance) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets card number.
     *
     * @return the card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets card number.
     *
     * @param cardNumber the card number
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(BigDecimal balance) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }

        Card card = (Card) o;

        if (getId() != card.getId()) {
            return false;
        }
        if (getCardNumber() != null ? !getCardNumber().equals(card.getCardNumber()) : card.getCardNumber() != null) {
            return false;
        }
        if (getBalance() != null ? !getBalance().equals(card.getBalance()) : card.getBalance() != null) {
            return false;
        }
        return getUser() != null ? getUser().equals(card.getUser()) : card.getUser() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getCardNumber() != null ? getCardNumber().hashCode() : 0);
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", user=" + user +
                '}';
    }
}
