package com.xx.blog.conponent;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截器，写完一定要配置，配置在MvcConfig
 */
public class Intercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("loginUser") == null) {
            //请求转发，一个请求跨多个servlet用，地址不发生变化
//            request.getRequestDispatcher("/").forward(request, response);
            response.sendRedirect("/");
//            request.getRequestDispatcher("/index");
            System.out.println("我重定向了");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        后处理回调方法，实现处理器的后处理（但在渲染视图之前）。
//
//        此时可以通过 modelAndView（模型和视图对象）对模型数据进行处理或对视图进行处理，modelAndView 也可能为 null。
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        整个请求处理完毕回调方法，即在视图渲染完毕时回调。
//
//        类似于try-catch-finally中的finally，但仅调用处理器执行链中 preHandle 返回 true 的拦截器的 afterCompletion。
    }
}
