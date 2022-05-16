package lab4;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab4.Calculation;
import lab4.CalculationImpl;
@WebServlet(name="Calc", urlPatterns="/Calc")

public class Calc extends HttpServlet {
	
//check hook web
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.seteAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}
	public static class RequestCalc extends Calculation{
		private final String first_calc;
		private final String second_calc;
		public int first_try;	
		public int second_try;
		private int result;
		
		RequestCalc(String first,String second) {
		this.first_calc = first;
		this.second_calc = second;
	}
		
	public static RequestCalc fromRequestParameters(HttpServletRequest request) {
		return new RequestCalc(
		request.getParameter("first"),
		request.getParameter("second"));
	}
	
	public void seteAsRequestAttributesAndCalculate(HttpServletRequest request) {
		request.setAttribute("first", first_calc);
		request.setAttribute("second", second_calc);
		try {
			first_try = Integer.parseInt(first_calc);
			second_try = Integer.parseInt(second_calc);
		}
		catch(NumberFormatException e) {
			first_try = 0;
			second_try = 0;
		}
	
		CalculationImpl calcer=new CalculationImpl(first_try,second_try);
		result=(first_try*10) * (second_try*10);
		request.setAttribute("result",calcer.getS());
		
	}
	
	
	
	}
	
	
	
	

}
