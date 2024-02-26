package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Employee1 extends HttpServlet {

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	
		String id=request.getParameter("id");
		String first=request.getParameter("first");
		String last=request.getParameter("last");
		String email=request.getParameter("email");
		String design=request.getParameter("epost");
		String region=request.getParameter("region");
		String city=request.getParameter("city");
		String doj=request.getParameter("date");
		String dept=request.getParameter("dept");
		String salary=request.getParameter("salary");
		double amount=Double.parseDouble(salary); 
		String phoneno=request.getParameter("phone");
		long phno=Long.parseLong(phoneno);
		
		//response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>");
		out.println("Employee Servlet Executed...</h1>");
		out.println("<font size=6 color='blue'>");
		out.println("<br>Employee Id = "+id);
		out.println("<br>First Name : "+first);
		out.println("<br>Last Name : "+last);
		out.println("<br>Email : "+email);
		out.println("<br>Designation : "+design);
		out.println("<br>Region : "+region);
		out.println("<br>City : "+city);
		out.println("<br>Date of joining : "+doj);
		out.println("<br>Department : "+dept);
		out.println("<br>Salary : "+amount);
		out.println("<br>Phone number : "+phno);
		out.println("</font> </body></html>");
		
		
	}

}
