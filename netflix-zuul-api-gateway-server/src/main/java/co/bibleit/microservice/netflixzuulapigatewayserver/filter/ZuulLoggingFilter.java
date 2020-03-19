package co.bibleit.microservice.netflixzuulapigatewayserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // "pre" or "post" or error
    @Override
    public String filterType() {
        return "pre";
    }

    // for multiple filters, this gives a specific filter priority order.
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        // for every request
        return true;
    }

    // real logic
    @Override
    public Object run() throws ZuulException {

        // log details of the request
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("request----->>>>>> {}  request uri ---->>>>>>> {}", request, request.getRequestURI());
        return null;
    }
}
