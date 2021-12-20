package cn.test.Testing;

import cn.test.junit.Cal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calTest {
    @Before//用于资源申请
    public void init(){
        System.out.println("Before");
    }

    @After//用于资源释放
    public void close(){
        System.out.println("After");
    }

    @Test
    public void test(){
        Cal cal=new Cal();
        int c=cal.add(1,2);
        System.out.println(c);
        Assert.assertEquals(4,c);//对比，前面是期望，后面是实际
    }

    @Test
    public void test02(){
        Cal cal=new Cal();
        int c=cal.del(1,2);
        System.out.println(c);
        Assert.assertEquals(-1,c);
    }
}
