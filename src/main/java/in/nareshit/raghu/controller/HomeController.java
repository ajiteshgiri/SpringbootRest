package in.nareshit.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.User;
import in.nareshit.raghu.service.UserDaoService;

@RestController
public class HomeController {

	@Autowired  
	private UserDaoService service; 
	@GetMapping("/users")  
	public List<User> retriveAllUsers()  
	{  
		
	return service.findAll();  
	}  
	//retrieves a specific user detail  
	@GetMapping("/users/{id}")  
	public User retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  
}
