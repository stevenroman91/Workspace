package fr.gtm.blog.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;


public class AutowiredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected AutowireCapableBeanFactory ctx;
    
    public void init() throws ServletException{
    	WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
    	ctx = context.getAutowireCapableBeanFactory();
    	ctx.autowireBean(this);
    }

}
