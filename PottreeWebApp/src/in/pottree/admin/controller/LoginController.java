package in.pottree.admin.controller;

import in.pottree.admin.form.LoginCredentials;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tenz
 * 
 */
@Controller
@SessionAttributes
public class LoginController {

	@Autowired
	private MessageSource messageSource;

	/**
	 * 
	 * @param loginCredentials
	 * @param result
	 * @return String
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(
			@ModelAttribute("login") LoginCredentials loginCredentials,
			BindingResult result) {
		if (StringUtils.isEmpty(loginCredentials.getUserName())
				|| !StringUtils.equalsIgnoreCase("admin",
						loginCredentials.getUserName())) {
			return "redirect:loginError.html";
		}

		else if (StringUtils.isEmpty(loginCredentials.getPassword())
				|| !StringUtils.equals("pass", loginCredentials.getPassword())) {
			return "redirect:loginError.html";
		} else {
			return "redirect:loginSuccess.html";
		}

	}

	/**
	 * 
	 * @return modelAndView
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/loginSuccess.html")
	public ModelAndView success() {
		ModelAndView modelAndView = new ModelAndView();
		Map modelMap = new HashMap();

		modelAndView.setViewName("indexView");
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}

	/**
	 * 
	 * @return ModelAndView
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/loginError.html")
	public ModelAndView error(Locale locale) {
		LoginCredentials cLoginCredentials = new LoginCredentials();
		ModelAndView modelAndView = new ModelAndView();
		Map modelMap = new HashMap();
		modelMap.put("loginError",
				messageSource.getMessage("label.msg.loginerror", null, locale));
		modelMap.put("command", cLoginCredentials);
		modelAndView.setViewName("login");
		modelAndView.addAllObjects(modelMap);
		return modelAndView;

	}

	/**
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/viewLogin")
	public ModelAndView viewLogin() {
		return new ModelAndView("login", "command", new LoginCredentials());
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/indexView")
	public ModelAndView indexView() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("indexView");

		return modelAndView;
	}
}
