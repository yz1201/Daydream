package cn.dbdj1201.cos.cap7;

/**
 * @author yz1201
 * @date 2020-06-23 14:03
 **/
public class Base {
    /*
        共享模型之不可变
            不可变类的使用

            不可变类的设计
            以String为例
                1，类+final
                2，域全部设置为私有的，不可变的。
                3，保护性拷贝，涉及改变成员的全部重新拷贝一份，指向新的对象
                4，以免影响效率，采用享元模式
            无状态类设计

            享元模式：
                适用场景：当需要重用数量有限的同一类对象时
                体现:
                    包装类的valueOf
                    String 常量池
                    BigDecimal BigInteger
                    注意：单个操作是原子的，但方法间的组合并不是原子的，仍需保证线程安全

            变量用final修饰，形如 final int a = 20；
            会在赋值时设置写屏障，不会让这个语句出现并发问题。
    */
}
