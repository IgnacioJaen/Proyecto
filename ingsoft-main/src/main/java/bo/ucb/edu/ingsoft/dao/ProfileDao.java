package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileDao {

    ProfileRequest profilegetp(Integer userId);
}
