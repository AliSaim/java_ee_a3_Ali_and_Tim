package mvc;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class YogaController
 */
@WebServlet("/jsp_yoga_form")
public class YogaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YogaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();

		 String name = request.getParameter("txtName");
		 String email = request.getParameter("txtEmail");
		 String contactNumber = request.getParameter("txtContactNumber");
		 

		 String gender = request.getParameter("radioGender");
		 
		 //get the value of the age and convert it to integer to pass it to bean class
		 String age = request.getParameter("txtAge");
		 int intAge = Integer.parseInt(age);
		 

		 String batch = request.getParameter("radioGroupBatchOptions");
		 
		 
		 //empty string value to add/concatenate the yoga options available
		 String yogaOptionsConcatenate = "";
		 
		 //get the value of all the checkboxes
		 String checkbox1 = request.getParameter("radioRegisterAnusara");
		 String checkbox2 = request.getParameter("radioRegisterAshtanga");
		 String checkbox3 = request.getParameter("radioRegisterBikram");
		 String checkbox4 = request.getParameter("radioRegisterPower");
		 String checkbox5 = request.getParameter("radioRegisterJivamukti");
		 String checkbox6 = request.getParameter("radioRegisterKundlini");
		 
		 
		 //check if value is NOT empty, if this is true, then add it string value to "yogaOptionsConcatenate"
		 if(checkbox1 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox1;
		 }
		 if(checkbox2 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox2;
		 }
		 if(checkbox3 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox3;
		 }
		 if(checkbox4 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox4;
		 }
		 if(checkbox5 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox5;
		 }
		 if(checkbox6 != "")
		 {
			 yogaOptionsConcatenate = yogaOptionsConcatenate +", "+  checkbox6;
		 }
		 
		 

		 String city = request.getParameter("txtCity");
		 
		 
		 
		 
		 
		 
		 
		 
		 YogaBean bean = new YogaBean();
		 
		 bean.setName(name);
		 bean.setEmail(email);
		 bean.setContactNumber(contactNumber);
		 bean.setGender(gender);
		 bean.setAge(intAge);
		 bean.setBatchThatFitsYourTiming(batch);
		 bean.setYogaYouWantToRegisterFor(yogaOptionsConcatenate);
		 bean.setCity(city);
		 
		 
		 System.out.println("Hello" + gender.toString());
		 
		 request.setAttribute("bean",bean);

		 //boolean status = bean.validate(); 
		 
		 //i//f(status){
		RequestDispatcher rd = request.getRequestDispatcher("JSP_View.jsp");
		rd.forward(request, response);
			// }
			 //else{
			 //RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
			 //rd.forward(request, response);
			 //} 
	}

}
