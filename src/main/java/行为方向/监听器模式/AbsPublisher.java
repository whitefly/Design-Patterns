package 行为方向.监听器模式;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsPublisher implements Publisher {

    private final List<WeatherListener> listeners = new ArrayList<>();

    @Override
    public void publishMsg(Message event) {
        doBefore();
        for (WeatherListener listener : listeners) {
            if (listener.isInterested(event)) {
                listener.doHandle(event);
            }
        }
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
