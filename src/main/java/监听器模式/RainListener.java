package 监听器模式;

public class RainListener implements WeatherListener {
    @Override
    public void doHandle(Message event) {
        System.out.println(this.getClass().getName() + " 天气:" + event.getMsg());
    }

    @Override
    public boolean isInterested(Message msg) {
        Class<?>[] clazzs = {RainMessage.class};

        for (Class<?> clazz : clazzs) {
            if (msg.getClass().isAssignableFrom(clazz)) return true;
        }
        return false;
    }
}
