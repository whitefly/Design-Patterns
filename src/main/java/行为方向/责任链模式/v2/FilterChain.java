package 行为方向.责任链模式.v2;

import 行为方向.责任链模式.Request;
import 行为方向.责任链模式.Response;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private final List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index >= filters.size()) return;
        final Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }

}
