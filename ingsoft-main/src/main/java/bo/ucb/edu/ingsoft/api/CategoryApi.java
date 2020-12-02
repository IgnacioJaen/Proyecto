package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CategoryBl;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Photos;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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
    @RequestMapping(path="/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category findById(@RequestParam Integer categoryId, HttpServletRequest request) {
        Category category= categoryBl.findCategoryById(categoryId);
        return category;
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

    //Metodo para sacar todas las categorias existentes

    @RequestMapping(path="/allCategories",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryRequest> categories(HttpServletRequest request) {
        List<CategoryRequest> category=categoryBl.categories();
        return category;
    }

    @RequestMapping(path="/images/{categoryId}" ,method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void uploadImages(@RequestParam MultipartFile images, @PathVariable("categoryId") Integer categoryId, HttpServletRequest request){
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        categoryBl.uploadImages(images,categoryId,transaction);
    }

    @RequestMapping(path="/image/categories/{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Photos findByIdPhoto(@PathVariable Integer categoryId, HttpServletRequest request) {
        return categoryBl.findImageCategoryById(categoryId);
    }

}
