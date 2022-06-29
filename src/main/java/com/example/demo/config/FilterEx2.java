package com.example.demo.config;

import javax.servlet.*;
import java.io.IOException;

public class FilterEx2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter2 생성");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("========== Filter2 ============");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Filter2 소멸");
    }
}
