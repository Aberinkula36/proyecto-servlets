package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");
		out.println("<p><a href=\"/myServlet2\">Vamos al otro Servlet</a></p>");
		// Formulario
		out.println("<form action=\"/myServlet2\">");  // Enviar a /myServlet2
		out.println("<label for=\"fname\">First name:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"Andrés\"><br>");  // Nombre del usuario
		out.println("<br><input type=\"submit\" value=\"Submit\">");  // Botón enviar
		out.println("</form>");
		out.println("</body></html>");
	}

}