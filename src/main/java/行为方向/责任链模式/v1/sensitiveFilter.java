package 行为方向.责任链模式.v1;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class sensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.content += "-->sensitiveFilter";
        response.content += "-->sensitiveFilter";
        return true;
    }
}
