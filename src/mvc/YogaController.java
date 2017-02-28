package mvc;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


/**
 * Servlet implementation class YogaController
 */
@WebServlet("/jsp_yoga_form")
public class YogaController extends HttpServlet {
	java.sql.Connection conn;
	java.sql.Statement stmt;
	ResultSet rs;
	int a;
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
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		try{
		//MySQL Connection
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/yogadb";
		String connectionUser = "root";
		String connectionPassword = "admin";
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM student");
		pw.println("<html>");
		pw.println("<body><h1>Registered Yoga Student Details</h1>");

		pw.println("<table border=1>");
		pw.println("<tr><th>Student ID</th>   <th>Student Name:</th>   <th>email Address:</th>    <th>Contact Number:</th>   <th>Gender:</th>   <th>Age:</th>  <th>Batch:</th>  <th>Yoga:</th>  <th>City:</th>  <th>Edith:</th>  <th>Delete:</th>     </tr>");
		
		while(rs.next())
		{
		 String id = rs.getString("studentID");
		 String name = rs.getString("studentName");
		 String email = rs.getString("email");
		 String contactNumber = rs.getString("contactNumber");
		 String gender = rs.getString("gender");
		 String age = rs.getString("age");
		 String batch = rs.getString("batch");
		 String yoga = rs.getString("yoga");
		 String city = rs.getString("city");
		 
		 pw.println("<tr>"
				 
		 		+ "<td>"+id+"</td> "
		 		+ "<td>"+name+"</td>"
		 		+ "<td>"+email+"</td>"
		 		+ "<td>"+contactNumber+"</td>"
		 		+ "<td>"+gender+"</td>"
		 		+ "<td>"+age+"</td>"
		 		+ "<td>"+batch+"</td>"
		 		+ "<td>"+yoga+"</td>"
		 		+ "<td>"+city+"</td>"	
		 		
		 		+ "<td>" +   "<a href="">Delete</a>" +   "</td>"
		 		

		 		+ "<td> <a href> Delete! </a> </td>"
		 		
		 		
		 		+ "</tr>");
		 }
		pw.println("</body></html>");
		}

		catch(ClassNotFoundException e)
		{
			pw.println(e);
		}
		
		catch(SQLException e)
		{
		pw.println(e);
		}
		
		catch(Exception e) {
		pw.println(e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();

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
		 
		 
		 
			try
			{
				//MySQL Connection
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				String connectionUrl = "jdbc:mysql://localhost:3306/yogadb";
				String connectionUser = "root";
				String connectionPassword = "admin";
				conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
				
				stmt = conn.createStatement();
				
				a = stmt.executeUpdate("INSERT INTO yogadb.student (studentName, email, contactNumber, gender, age, batch, yoga, city) VALUES ('"+ name +"', '"+ email +"', '"+ contactNumber +"', '"+ gender +"', "+age+", '"+ batch +"', '"+ yogaOptionsConcatenate +"', '"+ city +"');");
				
				
				out.println(name + " has been added to the database!!!");
				
			}
			catch(ClassNotFoundException e)
			{
				out.println(e);
			}
			catch(SQLException e)
			{
				out.println(e);
			}
			catch(Exception e) {
				out.println(e);
			}

	
		//RequestDispatcher rd = request.getRequestDispatcher("JSP_View.jsp");
		//rd.forward(request, response);

	}

}
