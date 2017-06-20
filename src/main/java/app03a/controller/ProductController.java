package app03a.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//产品的控制器
@Controller
@RequestMapping("/product")
public class ProductController {
	//到添加产品的页面
	@RequestMapping("/toAdd/{id}")
	public String toAdd(@PathVariable String id ,Model model){
		return "";
	}
	//添加产品的操作
	@RequestMapping("/add")
	public String add(HttpServletRequest request){
		return "";
	}
	//到修改产品的页面
	@RequestMapping("/toUpdate/{id}")
	public String toUpdate(@PathVariable String id){
		return "";
	}
	//修改产品的操作
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id){
		return "";
	}
	//删除产品的操作
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		return "";
	}
	//查询产品列表（带分页功能）
	@RequestMapping("/getAllProduct")
	public String queryAll(){
		return "";
	}
	//根据产品ID查询产品信息
	@RequestMapping("/getProductInfo/{id}")
	public String queryByID(@PathVariable String id){
		return "";
	}
}
