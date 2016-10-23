

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside do-get");
		PrintWriter out = response.getWriter();
//		out.println("u entered "+ request.getParameter("username") +":"+request.getParameter("password"));
		if(request.getParameter("username").equals("vinod") && request.getParameter("password").equals("jain")){
				out.println("login success");
		}
		else
			out.println("login failed");
	}
}
