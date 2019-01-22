package com.yyh.zuulserver.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class ZuulFilterDemo extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        RequestContext requestContext=RequestContext.getCurrentContext();
//        HttpServletRequest httpServletRequest=requestContext.getRequest();
//        Object o=httpServletRequest.getParameter("token");
//        if(o!=null){
//            return null;
//        }
//        requestContext.setSendZuulResponse(false);
//        requestContext.setResponseStatusCode(401);
//        try {
//            requestContext.getResponse().getWriter().write("token is empty");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
