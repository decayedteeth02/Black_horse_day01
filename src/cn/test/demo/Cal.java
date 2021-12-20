package cn.test.demo;

public class Cal {
    @Check
    public void add(){
        String aa=null;
        aa.toString();
        System.out.println("1+0"+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0"+(1-0));
    }
    @Check
    public void div(){
        System.out.println("1/0"+(1/0));
    }
}
