package com.xxx.filter;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SignValidateFilter implements Filter{

    private static Logger LOGGER = LoggerFactory.getLogger(SignValidateFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper((HttpServletRequest) request);
        String body = IOUtils.toString(requestWrapper.getBody(),request.getCharacterEncoding());
        LOGGER.info("request body is {}",body);
        //TODO 验证签名
        chain.doFilter(requestWrapper, response);
    }

    @Override
    public void destroy() {

    }
}
