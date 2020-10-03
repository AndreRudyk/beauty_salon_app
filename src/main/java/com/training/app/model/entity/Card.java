package com.training.app.model.entity;

import java.math.BigDecimal;

public class Card {

    private int id;
    private String cardNumber;
    private BigDecimal balance;

    public Card() {
    }

    public Card(int id, String cardNumber, BigDecimal balance) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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
        return getBalance() != null ? getBalance().equals(card.getBalance()) : card.getBalance() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getCardNumber() != null ? getCardNumber().hashCode() : 0);
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
