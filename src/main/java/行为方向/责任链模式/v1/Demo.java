package 行为方向.责任链模式.v1;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

public class Demo {
    public static void main(String[] args) {
        Request request = new Request("request");
        Response response = new Response("response");

        FilterChain filterChain1 = new FilterChain().addFilter(new HtmlFilter()).addFilter(new sensitiveFilter());
        FilterChain filterChain2 = new FilterChain().addFilter(new PasswordFilter()).addFilter(new AccessFilter());
        filterChain1.addFilter(filterChain2);

        filterChain1.doFilter(request, response);
        System.out.println(request.content);
        System.out.println(response.content);


    }
}
