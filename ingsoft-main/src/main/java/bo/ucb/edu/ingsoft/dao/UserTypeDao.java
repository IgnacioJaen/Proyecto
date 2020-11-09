package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.UserType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTypeDao {

    public UserType findByUserTypeId(UserType userType);

    public void userTypeInsert(UserType userType);

    public void userTypeUpdate(UserType userType);

    public void userTypeDelete(UserType userType);
}
