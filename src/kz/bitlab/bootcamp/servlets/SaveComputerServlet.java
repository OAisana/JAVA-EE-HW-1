package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Computer;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/savecomputer")
public class SaveComputerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));

        Computer computer = DBManager.getComputer(id);
        if(computer!=null){
            computer.setName(name);
            computer.setDescription(description);
            computer.setPrice(price);
            computer.setAmount(amount);
            DBManager.updateComputer(computer);
        }

        response.sendRedirect("/details?id="+id);

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/addcomputer.jsp").forward(request, response);
    }
}
