package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.AccountTypeRequest;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.AccountType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountTypeDao {
    //Metodos de la clase AccountTypeDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un tipo de cuenta y tiene un parametro de tipo accountType
    public AccountType findByAccountTypeId(AccountType accountType);

    //Metodo para agregar un tipo de cuenta y tiene un parametro de tipo accountType
    public void accountTypeInsert(AccountType accountType);

    //Metodo para actualizar un tipo de cuenta y tiene un parametro de tipo accountType
    public void accountTypeUpdate(AccountType accountType);

    //Metodo para eliminar un tipo de cuenta y tiene un parametro de tipo accountType
    public void accountTypeDelete(AccountType accountType);

    //Metodo para encontrar un tipo de cuenta y tiene un parametro de tipo accountTypeRequest
    //ya que es el request para la vista del usuario de tipo cliente
    public AccountTypeRequest findAccountTypeReqById(AccountTypeRequest accountTypeRequest);

    public List<AccountTypeRequest> accountTypes();


    public String findUserTypeById(Integer userId);
}
