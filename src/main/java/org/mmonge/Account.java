package org.mmonge;

public class Account {

    private String accountNo;
    private long balance;

    private AccountHelper helper;

    public boolean createAccount(String accountNo) {
        return helper.validateAccount(this);
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public AccountHelper getHelper() {
        return helper;
    }

    public void setHelper(AccountHelper helper) {
        this.helper = helper;
    }
}