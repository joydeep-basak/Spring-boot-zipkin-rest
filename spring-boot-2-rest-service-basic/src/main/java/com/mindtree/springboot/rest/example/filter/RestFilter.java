package com.mindtree.springboot.rest.example.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RestFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("Intializing filter");
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		log.info("Header:" , request.getHeader("X-COM-PERSIST"));
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		MDC.put("calledid", request.getHeader("calledid"));
		log.info("Token Filter pathInfo:" , request.getRequestURI());

		filterChain.doFilter(request, servletResponse);
	}

	public void destroy() {
	}
}