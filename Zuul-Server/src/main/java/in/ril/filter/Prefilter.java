package in.ril.filter;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class Prefilter extends ZuulFilter{

private static final Logger _logger = org.slf4j.LoggerFactory.getLogger(Prefilter.class);
	
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
	
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		_logger.info("request -> {} request uri -> {}",request,request.getRequestURI());
		//any validation logic, authentication logic, etc. can be done
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
