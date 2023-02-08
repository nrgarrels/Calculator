/**
 * @author Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 2/7/2023
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class getNumber2Servlet
 */
@WebServlet("/getNumber2Servlet")
public class getNumber2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumber2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber = request.getParameter("userNumber3");
		String userNumber2 = request.getParameter("userNumber4");
		Calculator sum = new Calculator(Integer.parseInt(userNumber), Integer.parseInt(userNumber2));
		
		request.setAttribute("userSum", sum);
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		
	}

}
