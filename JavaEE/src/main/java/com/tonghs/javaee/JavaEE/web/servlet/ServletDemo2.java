package com.tonghs.javaee.JavaEE.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * ServletDemo2 class
 *
 * @author tonghs
 * @date 2021/07/07
 */
public class ServletDemo2 implements Servlet {
    /**
     * 创建时执行，只执行一次，servlet 时单例的
     * 多个用户同时反问时，可能有现成安全问题，激励那个不要在 servlet 中定义成员变量。即使定义成员变量，也不用对其进行写操作。
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init ....");
    }

    /**
     * 获取 servlet 配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * servlet 被访问时执行
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service ......");
    }

    /**
     * 获取 servlet 信息，比如版本，作者等等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 服务器关闭时执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy ...");
    }
}
