package 行为方向.责任链模式.v2;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class sensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.content += "-->sensitiveFilter";
        chain.doFilter(request, response, chain);
        response.content += "-->sensitiveFilter";
    }
}
