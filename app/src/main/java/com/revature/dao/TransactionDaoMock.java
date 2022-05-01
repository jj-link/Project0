package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.Transaction;

import java.util.List;
import java.util.Map;

public class TransactionDaoMock implements ITransactionDao {

    Map<Integer, List<Transaction>> db = MockTransactionDB.getInstance().getDb();

    @Override
    public void createTransaction(Transaction t){

        if(t.getTransactionType() == "Transfer"){
            Integer idSender = t.getFromAccount().getAccountId();
            Integer idReceiver = t.getToAccount().getAccountId();

            List<Transaction> senderTransactions = db.get(idSender);
            List<Transaction> receiverTransactions = db.get(idReceiver);

            senderTransactions.add(t);
            receiverTransactions.add(t);

            db.put(idSender, senderTransactions);
            db.put(idReceiver,receiverTransactions);
        }
        else if(t.getTransactionType() == "Deposit"){
            Integer idReceiver = t.getToAccount().getAccountId();
            List<Transaction> receiverTransactions = db.get(idReceiver);
            receiverTransactions.add(t);
            db.put(idReceiver,receiverTransactions);
        }
        else if(t.getTransactionType() == "Withdrawal"){
            Integer idSender = t.getFromAccount().getAccountId();
            List<Transaction> senderTransactions = db.get(idSender);
            senderTransactions.add(t);
            db.put(idSender,senderTransactions);
        }
        else{
            System.out.println("Error creating transaction");
        }

    }

    @Override
    public List<Transaction> getTransactionsByAccountId(Integer id){
        return db.get(id);
    }

}
