package 监听器模式;

public class SnowListener implements WeatherListener {
    @Override
    public void doHandle(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println(this.getClass().getName() + " 天气:" + event.getWeather());
        }
    }
}
