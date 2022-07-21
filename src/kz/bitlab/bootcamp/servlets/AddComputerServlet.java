package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Computer;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addcomputer")
public class AddComputerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));

        Computer computer = new Computer();
        computer.setName(name);
        computer.setPrice(price);
        computer.setAmount(amount);
        computer.setDescription(description);
        DBManager.addComputer(computer);

        response.sendRedirect("/addcomputer?success=1");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/addcomputer.jsp").forward(request, response);
    }
}
