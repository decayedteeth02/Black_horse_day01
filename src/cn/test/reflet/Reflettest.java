package cn.test.reflet;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflettest {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
//        1.加载配置文件
//        创建properties
        Properties properties =new Properties();

        ClassLoader classLoader=Reflettest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);
//        获取配置文件中定义的数据
        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");
//        3.加载该类进内存
        Class cls=Class.forName(className);
//        4.创建对象
        Object obj=cls.newInstance();
//        5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }

}
