package org.scoula.ex06;

import org.scoula.ex06.command.Command;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServlet", value = "/")
public class FrontControllerServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    public void init(){
        getMap = new HashMap<>();
        postMap = new HashMap<>();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);

        Command command;
        if(request.getMethod().equalsIgnoreCase("Get")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }

        return command;
    }

    private void execute(Command command, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String viewName = command.execute(request, response);
    }
}
