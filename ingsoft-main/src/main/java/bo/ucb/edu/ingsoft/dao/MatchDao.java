package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Match;
import bo.ucb.edu.ingsoft.model.Messages;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MatchDao {

    //metodo para crear un match
    public void matchInsert(Match match);
}
