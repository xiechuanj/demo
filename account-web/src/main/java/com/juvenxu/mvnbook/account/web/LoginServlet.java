package com.juvenxu.mvnbook.account.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.juvenxu.mvnbook.account.service.AccountService;
import com.juvenxu.mvnbook.account.service.AccountServiceException;

public class LoginServlet
    extends HttpServlet
{
    private static final long serialVersionUID = 929160785365121624L;

    private ApplicationContext context;

    @Override
    public void init()
        throws ServletException
    {
        super.init();
        context = WebApplicationContextUtils.getWebApplicationContext( getServletContext() );
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp )
        throws ServletException,
            IOException
    {
        String id = req.getParameter( "id" );
        String password = req.getParameter( "password" );
        if ( id.equals("greatops") && password.equals("xiaotianguo") )
        {
            resp.setContentType("text/html; charset=gb2312");
            resp.sendRedirect("success.html");
        }
        else
        {
            resp.setContentType("text/html; charset=gb2312");
            resp.sendRedirect("failure.html");
        }
        /*
        if ( id == null || id.length() == 0 || password == null || password.length() == 0 )
        {
            resp.sendError( 400, "incomplete parameter" );
            return;
        }

        AccountService service = (AccountService) context.getBean( "accountService" );

        try
        {
            // service.login( id, password );
            if (id='greatops')
            {
                resp.getWriter().print( "Login Successful!" );
            }
            else
            {
                resp.getWriter().print( "Login Failed!" );
            }

        }
        catch ( AccountServiceException e )
        {
            resp.sendError( 400, e.getMessage() );
        }
        */
    }
}
