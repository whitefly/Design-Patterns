package 监听器模式;

public interface EventCaster {

    void castEvent(WeatherEvent event);

    void addListener(WeatherListener listener);

    void deleteListener(WeatherListener listener);
}
