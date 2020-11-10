package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CategoryBl;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(value = "/v1/category")
public class CategoryApi {

    private CategoryBl categoryBl;
    //Constructor de la clase CategoryApi recibe un parametro de tipo CategoryBl
    @Autowired
    public CategoryApi(CategoryBl categoryBl) {
        this.categoryBl = categoryBl;
    }

    //Metodo que obtiene una categoria por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category findById(@RequestBody Category category, HttpServletRequest request) {
        return categoryBl.findCategoryById(category);
    }

    //Metodo que agrega una categoria a traves del requestMethod POST
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category insertcategory(@RequestBody Category category, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        categoryBl.insertCategory(category,transaction);
        return  category;

    }

    //Metodo que actualiza una categoria a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category updatecategory(@RequestBody Category category, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        categoryBl.updateCategory(category,transaction);
        return  category;
    }

    //Metodo que elimina una categoria a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(path="/delete",method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category deletecategory(@RequestBody Category category, HttpServletRequest request) {

        return categoryBl.deleteCategory(category);
    }

}
