package com.company;

import java.math.BigDecimal;

public class Account {

    private BigDecimal accountBalance;
    private BigDecimal transactionAmount;
    private String accountHolderName;




    public Account(BigDecimal accountBalance, String accountHolderName){
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }



}
