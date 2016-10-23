package com.vinod;

public class LoginForm  {
	private static String username;
	private static String password;
	public void setUsername(String username){
		this.username=username;
	}
	public static String getUsername(){
		return username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public static String getPassword(){
		return password;
	}
}
