/*INTERNAL DOCUMENTATION
 * Student 1:  Name: Ali Saim (300759480)
 * Student 2:  Name: Tim Hitchcock (300801451)
 * Course: COMP303(Sec# 001) - Java EE Programming - Assignment 3 (Pair Programming)
 * Date: February 27 2017
 * Class Name: EdithYoga.java
 * Class Description:   This is the servlet java class that we use
 * 						 edit the already registered records
 * 						 
 * 
 * */

package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditYoga
 */
@WebServlet("/edit_yoga_form")
public class EditYoga extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditYoga() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
