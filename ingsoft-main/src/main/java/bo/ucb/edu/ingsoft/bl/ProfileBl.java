package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ProfileDao;
import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileBl {

    private ProfileDao profileDao;

    @Autowired
    public ProfileBl(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }

    public ProfileRequest profileget(String nameUser, String surnameUser) {
        return profileDao.profilegetp(nameUser,surnameUser);
    }
}
