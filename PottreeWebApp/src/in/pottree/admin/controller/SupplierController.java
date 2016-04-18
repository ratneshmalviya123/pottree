/**
 * 
 */
package in.pottree.admin.controller;

import in.pottree.admin.form.Category;
import in.pottree.admin.form.DisplayLinkList;
import in.pottree.admin.form.State;
import in.pottree.admin.form.SupplierForm;
import in.pottree.common.util.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tenz
 * 
 */
@Controller
@SessionAttributes
public class SupplierController {

	@Autowired
	private MessageSource messageSource;

	public List<DisplayLinkList> getAllLinks(Locale locale) {
		List<DisplayLinkList> displayLinkLists = new ArrayList<DisplayLinkList>();
		displayLinkLists.add(new DisplayLinkList("lookupSuppliers.html",
				messageSource.getMessage("link.label.lookup", null, locale)));

		return displayLinkLists;
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/addSuppliers.html")
	public ModelAndView showSuppliers() {
		String viewName = "manageSuppliers";
		ModelAndView modelAndView = new ModelAndView();
		List<Category> categoryList = new ArrayList<Category>();

		categoryList.add(new Category(1, "Crockery"));
		categoryList.add(new Category(2, "Pots"));
		categoryList.add(new Category(3, "Vases"));
		categoryList.add(new Category(4, "HomeDecor"));
		categoryList.add(new Category(5, "Art Pieces"));

		modelAndView.addObject(Constants.CATEGORY_LIST, categoryList);
		modelAndView.setViewName(viewName);

		return modelAndView;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/manageSuppliers.html")
	public ModelAndView manageSupplier(Locale locale) {
		String viewName = "manageSuppliers";
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
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/lookupSuppliers.html")
	public ModelAndView lookupSuppliers(Locale locale) {
		String viewName = "lookupSuppliers";
		ModelAndView modelAndView = new ModelAndView();

		List<State> states = new ArrayList<State>();
		states.add(new State(1, "Kerala"));
		states.add(new State(2, "UP"));
		states.add(new State(3, "Maharashtra"));
		Map modelMap = new HashMap();
		modelMap.put("linkLists", getAllLinks(locale));
		modelAndView.addObject(Constants.CITY_LIST, states);
		modelAndView.addObject("command", new SupplierForm());
		modelAndView.setViewName(viewName);
		modelAndView.addAllObjects(modelMap);
		return modelAndView;

	}

	/**
	 * 
	 * @param locale
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/getSuppliers.html")
	public ModelAndView getSuppliers(Locale locale) {

		ModelAndView modelAndView = new ModelAndView();
		Map modelMap = new HashMap();
		modelMap.put("message", "get some suppliers !!!");
		modelAndView.addAllObjects(modelMap);
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
