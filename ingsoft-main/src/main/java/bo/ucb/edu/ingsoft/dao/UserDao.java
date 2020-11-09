package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User findByUserId(User user);

    public void userInsert(User user);

    public void userUpdate(User user);

    public void userDelete(User user);
}
