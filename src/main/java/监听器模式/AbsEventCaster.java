package 监听器模式;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsEventCaster implements EventCaster {

    private List<WeatherListener> listeners = new ArrayList<>();

    @Override
    public void castEvent(WeatherEvent event) {
        doBefore();
        listeners.forEach(listener -> listener.doHandle(event));
        doAfter();
    }

    @Override
    public void addListener(WeatherListener listener) {
        listeners.add(listener);
    }

    @Override
    public void deleteListener(WeatherListener listener) {
        listeners.remove(listener);
    }


    abstract void doBefore();


    abstract void doAfter();

}
