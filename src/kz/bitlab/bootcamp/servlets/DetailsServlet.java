package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Computer;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        Computer computer = DBManager.getComputer(id);
        request.setAttribute("computer", computer);
        request.getRequestDispatcher("/details.jsp").forward(request, response);

    }
}
