package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.UserSubcategoryBl;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.UserSubcategory;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path="/userSubMatch",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserSubcategory> getUserSubMatches(@RequestParam Integer userId, HttpServletRequest request) {
        List<UserSubcategory> userSubcategories=userSubcategoryBl.getUserSubMatches(userId);
        return userSubcategories;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserSubcategory insertUserSubcategory(@RequestBody UserSubcategory userSubcategory, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userSubcategoryBl.insertUserSubcategory(userSubcategory,transaction);
        return  userSubcategory;

    }

}
