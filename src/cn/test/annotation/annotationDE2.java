package cn.test.annotation;

@SuppressWarnings("all")//压制警告
//一般传递@SuppressWarnings("all")
public class annotationDE2 {
    @Override//检测该标注的内容是否继承父类接口
    public String toString() {
        return "annotationDE2{}";
    }

    @Deprecated//该注释的内容已经过时
    public void show1(){
        //有缺陷
    }


//    @MyAnno
    public void show2(){
        //有替代show1方法
    }
    public void demo(){
        show1();
    }


}


