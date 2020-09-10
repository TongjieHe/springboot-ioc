全注解下的springioc


1.关于IOC
    Spring 最成功的是其提出的理念，而不是技术本身
    它所依赖的两个核心理念，一个是控制反转（ Inversion of Control, IoC ），另一个是面向切面编程（ Aspect Oriented Programming
    AOP IoC 容器是 Spring 的核心，可以说 Spring 是一种基于 IoC容器编程的框架（spring通过描述来创建对象）

2.装配你的Bean
    @Component:注解表明这个类将被spring容器扫描装配
    @ComponentScan:代表将会进行扫描，默认情况下只扫描类所在的当前包和子包；我们可以通过修改配置项自己设置，详见源码
    @Bean:装配第三方bean
3.依赖注入
    @Autowired
    @Primary
    @Quelifier
    带有参数的构造方法的
4.生命周期
    定义--初始化--生存期--销毁
    懒加载 lazyinit = true
5.使用属性文件
    @Value ("${ database.password}"}  ：即可以加在属性上，也可以加在方法上
    @ConfigurationProperties ("database") : 加在类上，将与 POJO 的属性名称组成属性全限定名去配置文件里查
    数据库配置可以移动到jdbc.properties中，然后在启动类上加入注解：@PropertySource(value={"classpath:jclbc.properties"｝ ，ignoreResourceNotFound=true)，value可以存在多个值
6.条件装配bean
    如果漏掉一些database的配置，ioc进行数据源的装配时会抛出异常，导致程序无法继续进行，这时，我们通过条件装配bean
    加上 @Conditional(DatabaseConditional.class)注解，通过配置类DatabaseConditional来实现
7.bean的作用域
     在类上加 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)，设置该类的作用域
                作用域类型               使用范围                作用域描述
                singleton           所有 pring 应用         默认值 loC 容器只存在单例
                prototype           所有 Spring 应用        每当从 IoC 容器中取出一个 Bean，则创建一个新的Bean
                session             Spring Web 应用         HTTP 会话
                application         Spring Web 应用         Web 工程生命周期
                request             Spring Web 应用         Web 工程单次请求（request）
             global Session         Spring Web 应用         在一个全局的 HTTP Session 中，一个Bean 定义对应一个实例 实践中基本不使用
8.＠Profile
    项目往往要面临开发环境、测试环境、准生产环境（用于模拟真实生产环境部署所用〉和生产环境的切换，可以用profile实现多个环境数据库资源切换
    JAVA_OPTS= "-D spring.profiles.active=dev"配置可以启动profile机制
    不进行配置时，＠Profile标注的bean不会被spring装配到ioc容器中，配置之后spring.profiles.active的优先级大于spring profiles.default的优先级

