package 创建实例方向.builder;

public class DbConfig {
    private String url;
    private String ip;
    private int port;
    private String dbName;

    public DbConfig(String url, String ip, int port, String dbName) {
        this.url = url;
        this.ip = ip;
        this.port = port;
        this.dbName = dbName;
    }

    static class Builder {
        private String url;
        private String ip;
        private int port;
        private String dbName;

        public Builder() {
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public DbConfig build() {
            return new DbConfig(url, ip, port, dbName);
        }
    }


}
