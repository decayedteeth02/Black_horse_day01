package cn.test.annotation;

//自定义注解格式
//元注释
//public @interface 注解名称



public @interface MyAnno {
    int value();
    Person per();
    MyAnno2 anno2();
    String[] strs();
    String show2() default "张三";
/*
    Person per();
    MyAnno2 anno2();

    String[] strs();*/

}
