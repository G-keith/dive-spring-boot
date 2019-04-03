package com.keith.divespringboot.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-02
 */
@WebServlet(urlPatterns = "/my/servlet",asyncSupported=true)
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
        AsyncContext asyncContext=req.startAsync();
        asyncContext.start(()->{
            try {
                resp.getWriter().println("HelloWorld");
                //触发异步完成
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
