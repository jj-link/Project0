package com.revature.services;

import com.revature.dao.IAccountDao;
import com.revature.dao.ITransactionDao;
import com.revature.exceptions.InvalidAmountException;
import com.revature.exceptions.NegativeBalanceException;
import com.revature.models.Account;
import com.revature.models.Transaction;
import com.revature.models.User;

import java.util.Date;
import java.util.List;

public class TransactionService {

    private final ITransactionDao tDao;

    public TransactionService(ITransactionDao tDao){
        this.tDao = tDao;
    }

    public void transferFunds(String transactionType, User user, Account sender, Account receiver, double amount, Date timeStamp){
        Transaction newTransfer = new Transaction(transactionType, user, sender, receiver, amount, timeStamp);
        tDao.createTransaction(newTransfer);

        //update sender account object
        List<Transaction> senderHistory = sender.getTransactions();
        senderHistory.add(newTransfer);
        sender.setBalance(sender.getBalance() - amount);

        //update receiver account object
        List<Transaction> receiverHistory = receiver.getTransactions();
        receiverHistory.add(newTransfer);
        receiver.setBalance(receiver.getBalance() + amount);

    }

    public void deposit(String transactionType, User user, Account receiver, double amount, Date timeStamp) throws InvalidAmountException {
        if(amount > 0){
            Account sender = null;
            Transaction newDeposit = new Transaction(transactionType, user, sender, receiver, amount, timeStamp);
            tDao.createTransaction(newDeposit);

            //update receiver account object to reflect new deposit
            List<Transaction> receiverHistory = receiver.getTransactions();
            receiverHistory.add(newDeposit);
            receiver.setBalance(receiver.getBalance() + amount);
        }
        else{
            throw new InvalidAmountException();
        }
    }

    public void withdraw(String transactionType, User user, Account sender, double amount, Date timeStamp) throws NegativeBalanceException, InvalidAmountException {
        if (amount > 0) {
            if (sender.getBalance() - amount >= 0) {
                Account receiver = null;
                Transaction newWithdrawal = new Transaction(transactionType, user, sender, receiver, amount, timeStamp);
                tDao.createTransaction(newWithdrawal);

                //update sender account object to reflect new withdrawal
                List<Transaction> senderHistory = sender.getTransactions();
                senderHistory.add(newWithdrawal);
                sender.setBalance(sender.getBalance() - amount);
            }
            else{
                throw new NegativeBalanceException();
            }
        }
        else{
            throw new InvalidAmountException();
        }
    }



}
