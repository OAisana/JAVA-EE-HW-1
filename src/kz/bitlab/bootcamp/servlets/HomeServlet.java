package kz.bitlab.bootcamp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/indexpage")
public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>FIRST JAVA EE APP</title>");
        out.print("</head>");
        out.print("<body>");
        for (int i = 0; i < 10; i++) {
            out.print("<h1 style = 'color:darkblue;'>HELLO BITLAB</h1>");
        }
        out.print("</body>");
        out.print("</html>");
    }
}
