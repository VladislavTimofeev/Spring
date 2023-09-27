package org.example.servlet;

import org.example.entity.BookEntity;
import org.example.service.BookService;
import org.example.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BookServlet extends HttpServlet {

    private BookService bookService;

    public BookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<BookEntity> bookEntities = bookService.getAll();
        session.setAttribute("books", bookEntities);
        req.getRequestDispatcher("/WEB-INF/books.jsp").forward(req, resp);
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
