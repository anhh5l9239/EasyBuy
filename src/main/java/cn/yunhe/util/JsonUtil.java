package cn.yunhe.util;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * JSON工具类
 */
public class JsonUtil {

    /**
     * 将任意对象转换为json类型的字符串
     * @param response
     * @param object
     */
    public static void getJson(HttpServletResponse response, Object object) {
        response.setContentType("text/html; charset=UTF-8");

        response.setHeader("Pragma", "No-cache");   //禁用缓存
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 10);

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonStr = JSON.toJSONString(object);
        out.print(jsonStr);

        out.flush();

    }
}
