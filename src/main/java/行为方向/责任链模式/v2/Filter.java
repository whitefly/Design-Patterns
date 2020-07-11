package 行为方向.责任链模式.v2;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
