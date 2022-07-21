package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Computer;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deletecomputer")
public class DeleteComputerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        Computer computer = DBManager.getComputer(id);

        if(computer!=null){
            DBManager.deleteComputer(computer);
        }

        response.sendRedirect("/");

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/addcomputer.jsp").forward(request, response);
    }
}
