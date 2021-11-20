package in.nareshit.raghu.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.User;
@Component
public class UserDaoService {

	public static int userCount=5;
	private static List<User> list = new ArrayList<User>();
	
	static
	{
		list.add(new User(1,"John",new Date()));
		list.add(new User(2,"Robert",new Date()));
		list.add(new User(3,"Adam",new Date()));
		list.add(new User(4,"Adrew",new Date()));
		list.add(new User(5,"Jack",new Date()));
	}
	
	public List<User> findAll(){
		return list;
	}
	public User save(User user)  
	{  
		if(user.getId()==null)
		{  
		//increments the user id  
		user.setId(++userCount);  
		}  
	list.add(user);  
	return user;  
	} 
	public User findOne(int id)  
	{  
	for(User user:list)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  
	  
}
