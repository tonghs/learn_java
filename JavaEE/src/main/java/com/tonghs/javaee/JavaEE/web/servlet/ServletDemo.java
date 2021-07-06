package com.tonghs.javaee.JavaEE.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * servlet class
 *
 * @author tonghs
 * @date 2021/07/07
 */
public class ServletDemo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
