

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

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
		PrintWriter pw= response.getWriter();
		
		//product_id = request.getParameter("product_id_form").toString();
		//product_name = request.getParameter("product_name_form").toString();
		//product_quantity = request.getParameter("product_quantity_form").toString();
		//product_price = request.getParameter("product_price_form").toString();
		//product_category = request.getParameter("product_category_form").toString();
		
		pw.println("<html>");
		pw.println("<body><h1>Product Details</h1>");

		//chose a HTML border style for the table
		pw.println("<table border=2>");
		
		//Table formating
		pw.println("<tr>   <th>Product ID:</th>  <th>Product Name:</th>  <th>Quantity:</th>    <th>Price:</th>    <th>Category:</th>  </tr>");

			
		pw.println(" has been added to the database!!!");

		pw.println("</body></html>");
	}

}
