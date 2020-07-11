package 行为方向.责任链模式.v2;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class AccessFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.content += "-->AccessFilter";
        chain.doFilter(request, response, chain);
        response.content += "-->AccessFilter";
    }
}
