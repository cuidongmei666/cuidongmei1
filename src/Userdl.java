import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Userdl extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Userdl() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setCharacterEncoding("UTF-8");//�����ַ�����
	       response.setContentType("text/html");//������Ӧ����
	            PrintWriter out = response.getWriter();
	            out.println("<!DOCTYPE html>");
	            out.println("<HTML>");
	            out.println("<HEAD><TITLE>��¼ҳ��</TITLE>" +
	            "<meta http-equiv='content-type' content='text/html; charset=UTF-8'></HEAD>");
	            out.println(" <BODY>");
	            out.print(
	                    "<form id='form1' name='form1' method='get' action='servlet/UserJr'>" +
	                    "<label for='textfield'>�û�����</label>" +
	                    "<input type='text' name='userName' id='userName' /><br/> " +
	                    "<label for='textfield'>��&nbsp;&nbsp;&nbsp;�룺</label> " +
	                    "<input type='text' name='password' id='password' /><br/>" +
	                    "<input type='submit' name='button' id='button' value='�ύ' />" +
	                    "</form>");
	            out.println("  </BODY>");
	            out.println("</HTML>");
	            out.flush();
	            out.close();
	        
      }
	 }
