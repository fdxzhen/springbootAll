package com.zhenhao.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class TimeFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(
                "filter init"
        );
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始filter");
        Long start = new Date().getTime();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("耗时" + (new Date().getTime()-start));
        System.out.println("结束filter");
    }

    @Override
    public void destroy() {
        System.out.println("filter destory");
    }
}
