package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* Servlet路径配置
* */
//@WebServlet({"/d4","/de4","/dem4"}) 可以给一个项目配置多个路径
//@WebServlet("/user/demo4")           两层路径,多层路径以此类推
//@WebServlet("/user/*")                   *为通配符 啥都行
@WebServlet("*.do")                    //        *.XX  也行 .后面的字符没有限制
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4....");
        System.out.println(req);
    }
}
