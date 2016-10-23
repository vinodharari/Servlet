package org.vinod;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	StringBuilder csvSkills=new StringBuilder();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("txtFName");
		String lname = request.getParameter("txtLName");
		String gender = request.getParameter("rdoGendor");
		String email = request.getParameter("txtEmail");
		String state = request.getParameter("txtPassword");
		String password = request.getParameter("cboStates");
		String age = request.getParameter("cboAge");
		String address = request.getParameter("textarAddress");
		String skill = request.getParameter("chkSkills");
		
		System.out.println("fname : "+fname);
	
//		for (String skills:skill){
//			if(csvSkills.length()>0){}
//				//csvSkills.append(",");
//			
//			//csvSkills.append(skills);
//		}
		//String csvSkill=csvSkills.toString();
		
		GetsSets sets=new GetsSets();
		
		sets.setFname(fname);
		sets.setLname(lname);
		sets.setGender(gender);
		sets.setEmail(email);
		sets.setPassword(password);
		sets.setState(state);
		sets.setAge(age);
		sets.setAddress(address);
		sets.setSkill(skill);
		System.out.println(sets.getAddress());
		System.out.println(sets.getFname());
		
		try {
			DBManager.insert(sets);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
