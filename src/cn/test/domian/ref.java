package cn.test.domian;

public class ref {
    private String name;
    private Integer id;
    public String a;
    protected String b;
    String cc;


    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public ref() {
    }

    public ref(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ref{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
