package com.vinod;

public class LoginService {
	public boolean verifyCredentials(LoginForm loginform){
		if("vinod".equals(loginform.getUsarname())&&"jain".equals(loginform.getPassword())){
			return true;
		}
		return false;
	}
}
