## 粗读springboot源码的包含设计模式的案例实现


已经实现: 

## 创建实例方向
   1. 单例模式(IOC,4种不同的写法) 
   2. builder模式(数据库配置的参数) 
   3. 原型模式(ArrayList的clone()方式)
   4. 工厂模式(IOC)
    
## 类结构   
   1. 代理模式(AOP)
   2. 装饰器模式(IO流)
   3. adapter模式(字节流转字符流工具:InputStreamReader(InputStream is);SpringMvc的HandlerMethodAdapter)
   4. 桥接模式(防止类爆炸,用聚合代替继承)
   5. 门面模式(对外提供统一的接口,隐藏子系统复制的关系)
   
    
## 行为方法 
   1. 监听模式(消息的分发和消费,GUI点击事件)
   2. 责任链模式(Servlet的Filter)
   3. visitor模式(ASM字节码增强)
   4. mediator模式(所有微服务都走统一的MQ来完成解耦)
   5. 模板方法(scrapy里面各种pipeline,parse等等,数据流完成,等待用户实现特定的钩子函数)
   
