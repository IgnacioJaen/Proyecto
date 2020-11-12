package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ProfileDao;
import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileBl {

    private ProfileDao profileDao;

    //Constructor de la clase ProfileBl recibe dos parametros de tipo profileDao y transactionDao
    @Autowired
    public ProfileBl(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }

    //Metodo que a traves del objeto profileDao llama al metodo para encontrar un
    //perfil por medio del ID
    public ProfileRequest profileget(Integer userId) {
        return profileDao.profilegetp(userId);
    }
}
