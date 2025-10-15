
public class Person {
    //姓名
    String name;
    //岗位
    String job;
    Person(String name,String job)
    {
        this.name=name;
        this.job=job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    //用于处理订单的方法
    public void orderProcessing(Order order)
    {
        System.out.println(order.id+"订单开始处理");
    }
}

