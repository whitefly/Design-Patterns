package 监听器模式;

public class RainListener implements WeatherListener {
    @Override
    public void doHandle(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println(this.getClass().getName() + " 天气:" + event.getWeather());
        }
    }
}
