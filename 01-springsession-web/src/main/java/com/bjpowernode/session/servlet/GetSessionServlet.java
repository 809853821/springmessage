package com.bjpowernode.session.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description:
 *
 * @date:2019/7/1221:31
 * @author:809853821@qq.com
 */
@WebServlet(urlPatterns = "/getSession")
public class GetSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = (String) request.getSession().getAttribute("url");
        response.getWriter().write(url == null ? "No Session":url);
    }
}
