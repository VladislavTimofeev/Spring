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


}
