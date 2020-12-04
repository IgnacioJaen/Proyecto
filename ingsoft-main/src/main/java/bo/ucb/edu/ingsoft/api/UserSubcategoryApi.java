package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.UserSubcategoryBl;
import bo.ucb.edu.ingsoft.model.UserSubcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/userSubcategory")
public class UserSubcategoryApi {
    private UserSubcategoryBl userSubcategoryBl;

    @Autowired
    public UserSubcategoryApi(UserSubcategoryBl userSubcategoryBl) {
        this.userSubcategoryBl = userSubcategoryBl;
    }


    @RequestMapping(path="/userSubcategories",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserSubcategory> getUserSubcategories(@RequestParam Integer userId, HttpServletRequest request) {
        List<UserSubcategory> userSubcategories=userSubcategoryBl.getUserSubcategories(userId);
        return userSubcategories;
    }
}
