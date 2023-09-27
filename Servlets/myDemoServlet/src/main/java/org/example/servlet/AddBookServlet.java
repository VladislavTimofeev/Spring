package org.example.servlet;

import org.example.service.BookService;
import org.example.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddBookServlet extends HttpServlet {

    private BookService bookService;

    public AddBookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("addbook/jsp");
        PrintWriter writer = resp.getWriter();

        String numberOfPage = req.getParameter("numberOfPage");
        String title = req.getParameter("title");
        String releaseYear = req.getParameter("releaseYear");

        try {
            writer.println("<p>NumberOfPage: " + numberOfPage + "</p>");
            writer.println("<p>Title: " + title + "</p>");
            writer.println("<p>ReleaseYear: " + releaseYear + "</p>");
        } finally {
            writer.close();
        }
    }

}