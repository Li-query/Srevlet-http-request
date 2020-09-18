package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo4")
public class RequrstDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //获取请求头数据: referer----告诉浏览器 我从哪里来
        String referer = request.getHeader("referer");
        System.out.println(referer);     //http://localhost/day_14/login.html
    //防盗链
    if (referer != null){
        if(referer.contains("/day_14")){
            //正常访问
           // System.out.println("播放电影");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("播放电影");
        }else  {
            System.out.println("想看电影吗,那就来优酷");
        }
    }
    }
}
