package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.AccountTypeRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.AccountType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountTypeDao {

    public AccountType findByAccountTypeId(AccountType accountType);
    public void accountTypeInsert(AccountType accountType);
    public void accountTypeUpdate(AccountType accountType);
    public void accountTypeDelete(AccountType accountType);
    public AccountTypeRequest findAccountTypeReqById(AccountTypeRequest accountTypeRequest);

}
