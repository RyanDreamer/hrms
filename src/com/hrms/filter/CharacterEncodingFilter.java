package com.hrms.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CharacterEncodingFilter
 * 
 */
//@WebFilter("/CharacterEncodingFilter")
public class CharacterEncodingFilter implements Filter {
	
	private FilterConfig config = null;
	private String encode = null;
    /**
     * Default constructor. 
     */
    public CharacterEncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse)response;
		if (this.encode !=null && this.encode.equals("")) {
			req.setCharacterEncoding(this.encode);
			resp.setContentType("text/html; charset=UTF-8");
		} else {
			req.setCharacterEncoding(this.encode);
			resp.setContentType("text/html; charset=UTF-8");
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		this.config = fConfig;
		this.encode = config.getInitParameter("encoding")==null?"utf-8":config.getInitParameter("encoding");
	}

}
