package app03a.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import app03a.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	//spring自动装配
	@Autowired
	private TestService test;
	@RequestMapping(value = "/delete/{name}", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String delete(@PathVariable String name) {
		System.out.println("delete:"+name);
		test.add();
		return "test";
	}
	@RequestMapping("/save/{id}")
	public String save(@PathVariable int id){
		System.out.println("save:"+id);
		return "save";
	}
	@RequestMapping("/doProcess")
	public String process(HttpServletRequest request){
		String name = request.getParameter("name");
		System.out.println(name);
		return "/app01/process";
	}
	@RequestMapping("/toLogin")
	public String toLogin(HttpSession httpSession){
		Object user = httpSession.getServletContext().getAttribute("user");
		String mapping = "";
		if (user == null) {
			mapping = "/view/login.html";
		} else {
			mapping = "";
		}
		return mapping;
	}
}
