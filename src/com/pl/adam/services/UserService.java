package com.pl.adam.services;
import java.util.*;
import com.pl.adam.dto.*;

public class UserService {
	
	private List<User> users = new ArrayList<User>();
	
	public UserService()
	{
		User a = new User();
		User b = new User();
		User c = new User();
		User d = new User();

		a.setLogin("adam");
		a.setName("adam");
		a.setPassword("pass");
		a.setSurname("Urb");
		
		b.setLogin("lukasz");
		b.setName("lukasz");
		b.setPassword("pass");
		b.setSurname("Urb");
		
		c.setLogin("marcin");
		c.setName("marcin");
		c.setPassword("pass");
		c.setSurname("Urb");
		
		d.setLogin("ola");
		d.setName("ola");
		d.setPassword("pass");
		d.setSurname("Urb");

		users.add(a);
		users.add(b);
		users.add(c);
		users.add(d);
		
	}
	
	
	public boolean authenticate(String login, String password)
	{
		User u = getUser(login);
		if(u==null) return false;
		
		return u.getPassword().equals(password);
	}
	
	public User getUser(String login)
	{
		User res=null;
		for(User u : users)
		{
			if(u.getLogin().equals(login)){
				res = u;
				break;	
			}
		}
		return res;
	}
}
