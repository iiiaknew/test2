package com.iaknew.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="MyServlet", urlPatterns = {"/student/create.do","/student/delete.do","/student/update.do","/student/select.do"})
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        if ("/student/create.do".equals(path)){
            create(req, resp);
        }else if ("/student/delete.do".equals(path)){
            delete(req, resp);
        }else if ("/student/update.do".equals(path)){
            update(req, resp);
        }else if ("/student/select.do".equals(path)){
            select(req, resp);
        }
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行查询操作");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行修改操作");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行删除操作");
    }

    private void create(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行增加操作");
    }
}
