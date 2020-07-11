package 行为方向.责任链模式.v1;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private final List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response) {
        for (Filter filter : filters) {
            if (!filter.doFilter(request, response)) {
                return false;
            }
        }
        return true;
    }

}
