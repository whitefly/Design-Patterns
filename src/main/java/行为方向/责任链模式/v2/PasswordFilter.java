package 行为方向.责任链模式.v2;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class PasswordFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.content += "-->PasswordFilter";
//        chain.doFilter(request, response, chain); 不执行chain.doFilter,就相当于在此处终止,不执行后面的节点
        response.content += "-->PasswordFilter";
    }
}
