package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Daos.CategoryDao;
import com.Entities.Category;



@Controller
public class CategoryController {

	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String gotoHome()
	{
			return "homepage";
	}


	@RequestMapping(value="form",method=RequestMethod.GET)
	public String fetchCategory(ModelMap map)
	{
		Category cat=new Category();
		map.addAttribute("CategoryObj", cat);
		return "CategoryForm";
	}
	
	
	@RequestMapping(value="addCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category categoryobj,ModelMap map)
	{
		
		map.addAttribute("categoryobj", categoryobj);	
	//	categoryDao.addCategory(categoryobj);
		System.out.println("i m here");
		boolean b=categoryDao.addCategory(categoryobj);
		System.out.println(b);
		if(b)
		return "homepage";
		else
			return "homepage";
	}
	
	@RequestMapping(value="viewCat",method=RequestMethod.POST)
	public String ViewCategory(ModelMap map)
	{
		List<Category> catlist=categoryDao.getAllCategory();
		map.addAttribute("catlist",catlist);
		return "CategoryView";
	}
	
	@RequestMapping(value="deleteCategory/{category}",method=RequestMethod.GET)
	public String delCategory(@PathVariable Category category,ModelMap map)
	{
		categoryDao.delCategory(category); 
		map.addAttribute("msg","item is deleted");
		List<Category> catlist=categoryDao.getAllCategory();
		map.addAttribute("catlist",catlist);
		return "CategoryView";
	}
	
	
	

}
