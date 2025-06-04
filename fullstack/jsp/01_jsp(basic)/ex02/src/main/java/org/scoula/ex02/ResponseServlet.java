package org.scoula.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // MIME타입 설정
        resp.setContentType("text/html;charset=UTF-8");

        //자바 I/O
        PrintWriter out = resp.getWriter();

        // html작성 및 출력
        out.print("<html><body>");
        out.print("ResponseServlet 요청 성공");
        out.print("</body></html>");
    }
}
