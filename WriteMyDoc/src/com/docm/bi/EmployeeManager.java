package com.docm.bi;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docm.controller.Controller;

/**
 * Servlet implementation class EmployeeManager
 */
@WebServlet("/EmployeeManager")
public class EmployeeManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Dynamically create HTML response to send back to browser
				response.setContentType("text/html");
				//response.setBufferSize(8192);
				response.getWriter().append("<b>").append("SAVED").append("</b>").append(" AGAIN");
				
				/* Dynamically include a resource (e.g., HTML page)
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/banner");
				if (dispatcher != null)
				dispatcher.include(request, response);

				// Write HTML to output stream being sent to the browser
				out.println("<h2>" + bookDetails.getTitle() + "</h2>" +
				out.println("</body></html>");

				out.close();  close the output stream */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		System.out.println("Success Yay");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String zipCode = request.getParameter("zipCode");
		Controller controller = new Controller();
		controller.saveEmployeeData(firstName, lastName, zipCode);
		
		
		
	}

}
