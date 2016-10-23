package com.vinod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet02
 */
public class Servlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		r2.setContentType("image/jpeg");
		File f1=new File("C:\\Users\\Vinod\\Desktop\\wall_pics\\practice.jpg");
		FileInputStream fin=new FileInputStream(f1);
		byte[] b=new byte[(int)f1.length()];
		fin.read(b);
		ServletOutputStream out=r2.getOutputStream();
		out.write(b);
		out.flush();
		out.close();
	}
}
