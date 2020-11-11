package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.SubcategoryBl;
import bo.ucb.edu.ingsoft.model.Subcategory;
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
@RequestMapping(value = "/v1/subcategory")
public class SubcategoryApi {

    private SubcategoryBl subcategoryBl;

    //Constructor de la clase SubcategoryApi recibe un parametro de tipo SubcategoryBl
    @Autowired
    public SubcategoryApi(SubcategoryBl subcategoryBl) {
        this.subcategoryBl = subcategoryBl;
    }

    //Metodo que obtiene una subcategoria por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory findById(@RequestBody Subcategory subcategory, HttpServletRequest request) {

        return subcategoryBl.findSubcategoryById(subcategory);
    }

    //Metodo que agrega una subcategoria a traves del requestMethod POST
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory insertcategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        subcategoryBl.insertSubcategory(subcategory,transaction);
        return  subcategory;

    }

    //Metodo que actualiza una subcategoria a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory updatecategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        subcategoryBl.updateSubcategory(subcategory,transaction);
        return  subcategory;
    }

    //Metodo que elimina una subcategoria a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory deletecategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        return subcategoryBl.deleteSubcategory(subcategory);
    }
}
