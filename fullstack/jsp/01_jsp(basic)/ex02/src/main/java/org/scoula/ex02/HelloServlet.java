package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = {"/xxx", "/yyy"})
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        System.out.println("HelloServlet 요청");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Test </h1>");
        out.println("</body></html>");
    }
}