package app03a.service;

import org.springframework.stereotype.Service;
//spring 需要进行自动装配的服务类注解
@Service
public class TestService {
	
	public void add(){
		System.out.println("add a object");
	}

}
