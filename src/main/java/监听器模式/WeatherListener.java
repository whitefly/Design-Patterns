package 监听器模式;

public interface WeatherListener {
    void doHandle(Message event);


    boolean isInterested(Message event);
}
