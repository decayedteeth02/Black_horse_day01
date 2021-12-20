package cn.test.annotation;

import java.lang.annotation.*;

//@Target() 描述作用的位置
//@Retention()描述注释保留的内容
//@Documented描述注释是否被抽取到API文档中
//@Inherited描述注释是否被子类继承,用了自动被子类继承
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//只能作用于类和方法和成员变量上上
@Retention(RetentionPolicy.RUNTIME)//当前被描述的注解，会保留到class字节码文件中,并被JVM读取到
public @interface MyAnno3 {
}
