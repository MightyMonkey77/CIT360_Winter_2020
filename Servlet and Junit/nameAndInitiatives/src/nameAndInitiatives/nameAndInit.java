package nameAndInitiatives;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "nameAndInit", urlPatterns = {"/nameAndInit"})
public class nameAndInit extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) { 
        	response.setContentType("text/html");
            out.println("<html><head><style>body"
                    + "{font-weight: bold;}"
                    + "</style></head><body>");
            String name1 = request.getParameter("name1");
            String init1 = request.getParameter("init1");
            
            String name2 = request.getParameter("name2");
            String init2 = request.getParameter("init2");
            
            String name3 = request.getParameter("name3");
            String init3 = request.getParameter("init3");
            
            String name4 = request.getParameter("name4");
            String init4 = request.getParameter("init4");
            
            String name5 = request.getParameter("name5");
            String init5 = request.getParameter("init5");
            
            out.println("<p>Characters Name: " + name1 + " and the initiative is: " + init1 +"</p>");
            out.println("<p>Characters Name: " + name2 + " and the initiative is: " + init2 +"</p>");
            out.println("<p>Characters Name: " + name3 + " and the initiative is: " + init3 +"</p>");
            out.println("<p>Characters Name: " + name4 + " and the initiative is: " + init4 +"</p>");
            out.println("<p>Characters Name: " + name5 + " and the initiative is: " + init5 +"</p>");
            
            out.println("</body></html>");
            
        }
	}
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("Not Available");
	    }
	 
	 public String getServletInfo() {
	        return "Short description";
	 }
}
