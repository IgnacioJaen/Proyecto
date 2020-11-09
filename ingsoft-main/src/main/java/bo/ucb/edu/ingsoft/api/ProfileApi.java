package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ProfileBl;
import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/profile")
public class ProfileApi {

    private ProfileBl profileBl;

    @Autowired
    public ProfileApi(ProfileBl profileBl) {
        this.profileBl = profileBl;
    }


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ProfileRequest findById(@RequestBody String nameUser, String surnameUser,HttpServletRequest request) {
        return profileBl.profileget(nameUser,surnameUser);
    }
}
