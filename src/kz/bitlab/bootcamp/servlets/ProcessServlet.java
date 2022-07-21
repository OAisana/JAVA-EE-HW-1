package kz.bitlab.bootcamp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/process")
public class ProcessServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String fullName = request.getParameter("user_full_name");
        int exam = Integer.parseInt(request.getParameter("exam"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>FIRST JAVA EE APP</title>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class = 'container mt-5'>");
        out.print("<div class = 'row'>");
        out.print("<div class = 'col-12 mx-auto'>");

        String mark = "F";

        if(exam>=90){
            mark = "A";
        }else if(exam>=75){
            mark = "B";
        }else if(exam>=60){
            mark = "C";
        }else if(exam>=50){
            mark = "D";
        }

        out.print("<h1>"+fullName + " GOT '" + mark +"' FOR EXAM</h1>");

        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}

