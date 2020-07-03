package cn.dbdj1201.springcode;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author yz1201
 * @date 2020-07-02 8:43
 **/
public class Base {
    /*
        Spring容器创建过程：
            1， this()
            2， register(Config.class);
            3， refresh()容器的创建刷新
        细说refresh
            1，prepareRefresh()刷新前的预处理
                i,  initPropertySources()初始化一些属性设置；子类自定义个性化的属性设置方法；
                ii, getEnvironment().validateRequiredProperties();校验属性的合法性
                iii,保存容器中的一些早期的事件
            2，获取BeanFactory
                i. 创建了一个BeanFactory对象，设置id
                ii. 返回该对象
            3，BeanFactory的一些预准备设置，BeanFactory进行一些设置
                i，设置BeanFactory的类加载器，支持表达式解析器
                ii，添加部分BeanPostProcessor【ApplicationContextAwarePostProcessor】
                iii，设置忽略的自动装配的接口
                iv, 注册可以解析的自动装配，我们能直接在任何组件中自动注入
                V，添加BeanPostProcessor [ApplicationListenerDetector]
                vi,添加编译时候的AspectJ
                vii,给BeanFactory中注册一些能用的组件
            4，postProcessorBeanFactory BeanFactory准备工作完成后的后置处理工作
                i，子类通过重写这个方法来在BeanFactory创建并预准备完成以后做进一步的设置。
           以上是BeanFactory的创建及预准备工作
            5,执行BeanDefinitionRegistryPostProcessor，在BeanFactory标准初始化之后执行
                按优先级排序执行
                再执行BeanFactoryPostProcessor，仍旧按顺序执行
            6，注册BeanPostProcessors
                不同接口类型的组件后置处理器，在bean创建前后的执行时机是不一样的。
                后置处理器都可以通过某些接口指定优先级



     */
}
