package cn.test.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

//测试框架
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Cal cal=new Cal();
        //2.获取字节码文件对象
        Class<? extends Cal> calClass = cal.getClass();
        //3.获取所有的方法
        Method[] methods = calClass.getMethods();
        int number=0;
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method:methods){
            //        4.判断是否有check注解
            if (method.isAnnotationPresent(Check.class)){
                try {//有，执行
                    method.invoke(cal);
                }catch (Exception e){
                    e.printStackTrace();
                    //6.捕获异常
                    number++;
                    bw.write(method.getName()+"方法出现异常");
                    bw.newLine();
                    bw.write("异常的名称"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------");
                }

            }
        }
        bw.write("本次测试一共出现了"+number+"次异常");
        bw.flush();
        bw.close();
    }
}
