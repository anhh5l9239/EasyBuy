package cn.yunhe.servlet;

import cn.yunhe.util.Captcha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * 图片Servlet，前端注册登陆使用
 */
@WebServlet(description = "图片验证码生成", urlPatterns = { "/ImageServlet" })
public class ImageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ImageServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        Captcha randomValidateCode = new Captcha();
        try {
            randomValidateCode.getRandcode(request, response);// 输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
