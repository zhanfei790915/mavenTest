package app03a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value = "/delete/{name}", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String delete(@PathVariable String name) {
		System.out.println("delete:"+name);
		return "test";
	}
	@RequestMapping("/save/{id}")
	public String save(@PathVariable int id){
		System.out.println("save:"+id);
		return "save";
	}
}
