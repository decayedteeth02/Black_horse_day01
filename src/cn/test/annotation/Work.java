package cn.test.annotation;

@MyAnno(value = 12,per =Person.P1,anno2 = @MyAnno2,strs = {"abc","cde"})
public class Work {
}
