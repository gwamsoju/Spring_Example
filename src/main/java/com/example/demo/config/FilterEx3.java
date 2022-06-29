package com.example.demo.config;

import javax.servlet.*;
import java.io.IOException;

public class FilterEx3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter3 생성");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("========== Filter3 ============");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Filter3 소멸");
    }
}
