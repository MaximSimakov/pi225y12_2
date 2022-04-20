package lab4;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/Calc")

public class Calc extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}
	private static class RequestCalc {
		private final String first_calc;
		private final String second_calc;
		private int result;
		
		private RequestCalc(String first,String second) {
		this.first_calc = first;
		this.second_calc = second;
	}
		
	public static RequestCalc fromRequestParameters(HttpServletRequest request) {
		return new RequestCalc(
		request.getParameter("first"),
		request.getParameter("second"));
	}
	
	public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
		request.setAttribute("first", first_calc);
		request.setAttribute("second", second_calc);
		int first_try;
		int second_try;
		try {
			first_try = Integer.parseInt(first_calc);
			second_try = Integer.parseInt(second_calc);
		}
		catch(NumberFormatException e) {
			first_try = 0;
			second_try = 0;
		}
		result=first_try * second_try;
		request.setAttribute("result",result);
		
	}
	}


}
