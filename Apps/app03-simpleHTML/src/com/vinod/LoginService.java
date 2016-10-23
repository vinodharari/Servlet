
package com.vinod;
import com.vinod.*;
public class LoginService {
	public boolean verifyCredentials(LoginForm loginform) {
		if("vinod".equals(LoginForm.getUsername()) && ("jain").equals(LoginForm.getPassword())){
			return true;
		}
		return false;
	}
}
