package com.vinod;
class LoginService
{
	public boolean verifyCreds(LoginForm loginform){
		if("vinod".equals(loginform.getUsername()) && "jain".equals(loginform.getPassword())){
			return true;
		}
		else{
			return false;
		}
	}
}
