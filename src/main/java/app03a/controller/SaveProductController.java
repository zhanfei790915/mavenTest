package app03a.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class SaveProductController implements Controller {
	public static final Log logger = LogFactory.getLog(SaveProductController.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		logger.info("SaveProductController is called!");
		return new ModelAndView("/WEB-INFO/jsp/productForm.jsp");
	}
}
