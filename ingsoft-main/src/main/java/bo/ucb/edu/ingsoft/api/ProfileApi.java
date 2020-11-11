package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ProfileBl;
import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/profile")
public class ProfileApi {

    private ProfileBl profileBl;

    //Constructor de la clase ProfileApi recibe un parametro de tipo ProfileBl
    @Autowired
    public ProfileApi(ProfileBl profileBl) {
        this.profileBl = profileBl;
    }

    //Metodo que obtiene un perfil por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo cliente
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ProfileRequest findById(@RequestParam Integer userId, HttpServletRequest request) {
        return profileBl.profileget(userId);
    }

}
