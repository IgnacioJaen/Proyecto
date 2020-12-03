package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.SubcategoryBl;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Subcategory;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
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
   @RequestMapping(path="/subcategory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory findBySubcategoryId(@RequestParam Integer subcategoryId, HttpServletRequest request) {
        Subcategory subcategory= subcategoryBl.findBySubcategoryId(subcategoryId);
        return subcategory;
    }


//Metodo que devuelve subcategorias por una categoria especifica
    @RequestMapping(path="/subcategory/subcategories",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subcategory> subcategoriesList(@RequestParam Integer categoryId, HttpServletRequest request) {
        List<Subcategory> subcategory=subcategoryBl.subcategoriesList(categoryId);
        return subcategory;
    }

    //Metodo que agrega una subcategoria a traves del requestMethod POST
    @RequestMapping(path="/subcategory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory insertcategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        subcategoryBl.insertSubcategory(subcategory,transaction);
        return  subcategory;

    }

    //Metodo que actualiza una subcategoria a traves del requestMethod PUT
    @RequestMapping(path="/subcategory",method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory updatecategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        subcategoryBl.updateSubcategory(subcategory,transaction);
        return  subcategory;
    }

    //Metodo que elimina una subcategoria a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(path="/subcategory/delete",method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subcategory deletecategory(@RequestBody Subcategory subcategory, HttpServletRequest request) {
        return subcategoryBl.deleteSubcategory(subcategory);
    }


    //Metodo para sacar todas las subcategorias existentes

    @RequestMapping(path="/subcategory/{categoryId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryRequest> subcategories(@PathVariable("categoryId") Integer categoryId, HttpServletRequest request) {
        List<CategoryRequest> subcategory=subcategoryBl.subcategories(categoryId);
        return subcategory;
    }


}
