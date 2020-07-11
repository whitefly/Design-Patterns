package 行为方向.责任链模式.v1;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class AccessFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.content += "-->AccessFilter";
        response.content += "-->AccessFilter";
        return true;
    }
}
