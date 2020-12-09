package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Match;
import bo.ucb.edu.ingsoft.model.Messages;

public interface MatchDao {

    //metodo para crear un match
    public void matchInsert(Match match);
}
