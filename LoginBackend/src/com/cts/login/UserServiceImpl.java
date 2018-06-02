package com.cts.login;

public class UserServiceImpl implements UserService{

	@Override
	public boolean validate(String id, String password) {
		if(id.equals("niit")&& password.equals("niit@gmail.com"))
		{
			return true;
		
		}else
		{
			return false;	
		}
		
	}

}
