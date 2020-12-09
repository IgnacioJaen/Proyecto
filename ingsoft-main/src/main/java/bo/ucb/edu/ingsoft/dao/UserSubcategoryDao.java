package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.UserSubcategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserSubcategoryDao {

    public List<UserSubcategory> getUserSubMatches(Integer userId);

    public List<UserSubcategory> getUserSubcategories(Integer userId);

    public void insertUserSubcategory(UserSubcategory userSubcategory);

}
