package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Transaction;

public interface TransactionDao {

    public Integer create(Transaction transaction);

    public Integer getLastInsertId();
}
