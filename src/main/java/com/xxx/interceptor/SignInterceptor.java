package com.xxx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xxx.filter.ContentCachingRequestWrapper;
import com.xxx.filter.SignValidateFilter;

public class SignInterceptor implements HandlerInterceptor {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SignValidateFilter.class);

	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object obj, Exception e) throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,Object obj, ModelAndView mav) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object obj) throws Exception {
		ContentCachingRequestWrapper requestWrapper = (ContentCachingRequestWrapper) request;
		String body = IOUtils.toString(requestWrapper.getBody(),request.getCharacterEncoding());
		LOGGER.info("interceptor request body is {}",body);
        //TODO 验证签名
		
		return true;
	} 

	
}
