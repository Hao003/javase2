package com.bjpowernode.javaweb.servelet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class genericServelet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out=servletResponse.getWriter();
        ServletConfig servletConfig=getServletConfig();
        out.print(servletConfig.getServletName());
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
    }
}
