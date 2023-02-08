/**
 * @author Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 2/7/2023
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class getNumberServlet
 */
@WebServlet("/getNumberServlet")
public class getNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber = request.getParameter("userNumber");
		String userNumber2 = request.getParameter("userNumber2");
		Calculator sum = new Calculator(Integer.parseInt(userNumber), Integer.parseInt(userNumber2));
		
		request.setAttribute("userSum", sum);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(sum.toString());
		//writer.close();
	}

}
