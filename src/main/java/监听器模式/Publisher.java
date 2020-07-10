package 监听器模式;

public interface Publisher {

    void publishMsg(Message event);

    void addListener(WeatherListener listener);

    void deleteListener(WeatherListener listener);
}
