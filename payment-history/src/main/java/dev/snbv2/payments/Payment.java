package dev.snbv2.payments;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String cardNumber;

    @Column
    private String cvc;

    @Column
    private Integer expirationMonth;

    @Column
    private Integer expirationYear;

    @Column
    private Double amount;

    @Column
    private String currency;

    @Column
    private String description;

    public Payment() {
    }

    public Payment(Integer id, String cardNumber, String cvc, Integer expirationMonth, Integer expirationYear,
            Double amount, String currency, String description) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment [amount=" + amount + ", cardNumber=" + cardNumber + ", currency=" + currency + ", cvc=" + cvc
                + ", description=" + description + ", expirationMonth=" + expirationMonth + ", expirationYear="
                + expirationYear + ", id=" + id + "]";
    }

}
