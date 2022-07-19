package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.User;
import kz.bitlab.bootcamp.db.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/indexpage")
public class HomeServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");

        User user = new User();
        user.setName(name);
        user.setSurname(surname);

        Users.addUser(user);
        response.sendRedirect("/");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ArrayList<User>users = Users.getUsers();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Home Work 3</title>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>");
        out.print("</head>");

        out.print("<body>");
        out.print("<div class = 'container mt-5'>");
        out.print("<form action = '/indexpage' method = 'post'>");

        out.print("<div class = 'row mt-3'>");
        out.print("<div class = 'col-10 mx-auto'>");
        out.print("<div>NAME</div>");
        out.print("<input type = 'text' class = 'form-control' name = 'user_name' placeholder = 'Insert name'>");
        out.print("</div>");
        out.print("</div>");

        out.print("<div class = 'row mt-3'>");
        out.print("<div class = 'col-10 mx-auto'>");
        out.print("<div>SURNAME</div>");
        out.print("<input type = 'text' class = 'form-control' name = 'user_surname' placeholder = 'Insert name'>");
        out.print("</div>");
        out.print("</div>");

        out.print("<div class = 'row mt-3'>");
        out.print("<div class = 'col-10 mx-auto'>");
        out.print("<button class = 'btn btn-success btn-sm'>SEND</button>");
        out.print("</div>");
        out.print("</div>");

        out.print("</form>");
        out.print("</div>");

        out.print("<div class = 'container mt-5'>");
        out.print("<table class = 'table table-striped table-hover'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("</tr>");
        out.print("</thead>");

        out.print("<tbody>");
        for(User us: users){
            out.print("<tr>");
            out.print("<td>" + us.getName() + "</td>");
            out.print("<td>" + us.getSurname() + "</td>");
            out.print("</tr>");
        }

        out.print("</tbody>");
        out.print("</table>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}