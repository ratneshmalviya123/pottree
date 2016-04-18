package in.pottree.admin.controller;

import in.pottree.admin.form.Category;
import in.pottree.admin.form.DisplayLinkList;
import in.pottree.admin.form.ProductCatgory;
import in.pottree.common.util.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ProductController {

	@Autowired
	private MessageSource messageSource;

	/**
	 * 
	 * @param locale
	 * @return
	 */
	public List<DisplayLinkList> getAllLinks(Locale locale) {
		List<DisplayLinkList> displayLinkLists = new ArrayList<DisplayLinkList>();
		displayLinkLists.add(new DisplayLinkList("lookUpproductCategory.html",
				messageSource.getMessage("link.label.lookup", null, locale)));
		displayLinkLists.add(new DisplayLinkList("newProductCategory.html",
				messageSource.getMessage("link.label.New", null, locale)));
		return displayLinkLists;
	}

	/**
	 * 
	 * @param productCatgory
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/addProductCategory", method = RequestMethod.POST)
	public String addProductCategory(
			@ModelAttribute("productCategory") ProductCatgory productCatgory,
			BindingResult result) {

		System.out.println(productCatgory.getProductCategory());
		System.out.println(productCatgory.getParentCategory());
		System.out.println(productCatgory.isCategoryEnabled());
		System.out.println(productCatgory.getDescription());

		return "redirect:successAddProductCategory.html";
	}

	/**
	 * 
	 * @param locale
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/productCategory.html")
	public ModelAndView ProductCategory(Locale locale) {
		String viewName = "productCategory";
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName(viewName);
		Map modelMap = new HashMap();
		modelMap.put("message", "Please click any option from the menu");
		modelMap.put("linkLists", getAllLinks(locale));
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}

	/**
	 * 
	 * @param locale
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/lookUpproductCategory.html")
	public ModelAndView showProductCategory(Locale locale) {
		String viewName = "lookUpproductCategory";
		ModelAndView modelAndView = new ModelAndView();
		List<Category> categoryList = new ArrayList<Category>();

		categoryList.add(new Category(1, "Crockery"));
		categoryList.add(new Category(2, "Pots"));
		categoryList.add(new Category(3, "Vases"));
		categoryList.add(new Category(4, "HomeDecor"));
		categoryList.add(new Category(5, "Art Pieces"));

		modelAndView.addObject(Constants.CATEGORY_LIST, categoryList);
		modelAndView.addObject("command", new ProductCatgory());
		modelAndView.setViewName(viewName);
		Map modelMap = new HashMap();
		modelMap.put("linkLists", getAllLinks(locale));
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}

	/**
	 * 
	 * @param locale
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/newProductCategory.html")
	public ModelAndView showNewProductCategory(Locale locale) {
		String viewName = "newProductCategory";
		ModelAndView modelAndView = new ModelAndView();
		List<Category> categoryList = new ArrayList<Category>();

		categoryList.add(new Category(1, "Crockery"));
		categoryList.add(new Category(2, "Pots"));
		categoryList.add(new Category(3, "Vases"));
		categoryList.add(new Category(4, "HomeDecor"));
		categoryList.add(new Category(5, "Art Pieces"));

		modelAndView.addObject(Constants.CATEGORY_LIST, categoryList);
		modelAndView.addObject("command", new ProductCatgory());
		modelAndView.setViewName(viewName);
		Map modelMap = new HashMap();
		modelMap.put("linkLists", getAllLinks(locale));
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}

	/**
	 * 
	 * @param request
	 * @param locale
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/successAddProductCategory.html")
	public ModelAndView successAddProductCategory(HttpServletRequest request,
			Locale locale) {
		ModelAndView modelAndView = new ModelAndView();
		Map modelMap = new HashMap();
		modelMap.put("message", messageSource.getMessage(
				"label.msg.success.add.product", null, locale));
		request.setAttribute("message", "Success");
		modelAndView.setViewName("success");
		modelAndView.addAllObjects(modelMap);
		return modelAndView;

	}

}