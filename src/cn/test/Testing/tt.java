package cn.test.Testing;

import cn.test.domian.ref;

import java.lang.reflect.Field;

public class tt {
    public static void main(String[] args) {
        //获取CLass对象
        Class cls=ref.class;

        //Field[] getFields() 获取所有public修饰的成员变量
        Field[] fields=cls.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("---------");
//        Field a = cls.getFields("cc");
//        ref r=new ref();
//        Object value=a.set();
//        System.out.println(value);
//        Field[] de=cls.getDeclaredFields();//getDeclaredFields获得所有的成员变量，不考虑修饰符
//        for (Field field:de){
//            System.out.println(field);
//        }
//        Field d = cls.getDeclaredFields("d");
//        Object value=d.get(p);

    }
}
