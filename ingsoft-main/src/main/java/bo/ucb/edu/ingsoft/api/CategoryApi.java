package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CategoryBl;
import bo.ucb.edu.ingsoft.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/category")
public class CategoryApi {

    private CategoryBl categoryBl;

    @Autowired
    public CategoryApi(CategoryBl categoryBl) {
        this.categoryBl = categoryBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category findById() {
        return categoryBl.findCategoryById(0);
    }

}
