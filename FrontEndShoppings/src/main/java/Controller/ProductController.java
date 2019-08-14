package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Daos.CategoryDao;
import com.Daos.ProductDao;
import com.Entities.Category;
import com.Entities.Product;



@Controller
public class ProductController {


	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ProductDao productDaoImpl;
	
	@RequestMapping(value="/pform",method=RequestMethod.GET)
	public ModelAndView getCategoryForm(){
		System.out.println("aa");
		ModelAndView mv=new ModelAndView("ProductForm");
		
		//This is the data we want to share
		mv.addObject("ProductObj",new Product());
		List<Category> categoryList=categoryDao.getAllCategory();
		mv.addObject("categorylists",categoryList);
		
		return mv;
	}
	@RequestMapping(value="addProduct",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Product productObj,ModelMap map)
	{
		
		
		productDaoImpl.addProduct(productObj);
		
			return "homepage";
	}

}
