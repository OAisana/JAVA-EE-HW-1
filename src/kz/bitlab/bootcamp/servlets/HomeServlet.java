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
        out.print("<table>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        out.print("<tr>");
        out.print("<td>A</td>");
        out.print("<td>A</td>");
        out.print("<td>1</td>");
        out.print("<td>1</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>B</td>");
        out.print("<td>B</td>");
        out.print("<td>2</td>");
        out.print("<td>2</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>C</td>");
        out.print("<td>C</td>");
        out.print("<td>3</td>");
        out.print("<td>3</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>D</td>");
        out.print("<td>D</td>");
        out.print("<td>4</td>");
        out.print("<td>4</td>");
        out.print("</tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }
}
