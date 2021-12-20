package cn.test.annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.test.annotation.Demo2",methodName = "show")
public class Reflettest {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        //1.解释注释
        //1.1获得该类的字节码对象文件
        Class<Reflettest> reflettestClass = Reflettest.class;
        //2.获取边上的注释对象
        //其实就是在内存中生成一个该注释接口的子类实现对象
        /*
        * public class ProImpl implements Pro{
        *       public String className(){
        *           return "cn.test.annotation.Demo1"
        *       }
        *       public String methodName(){
        *           return "show";
        *       }
        * }
        * */
        Pro annotation = reflettestClass.getAnnotation(Pro.class);
        //3.调用注释对象中定义的抽象方法，获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
//        System.out.println(className+" "+methodName);
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
