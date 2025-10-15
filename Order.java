public class Order {
    //订单编号
    String id;
    //订单状态
    String state;
    //处理人员
    Person person;
    public Order(String id, String state)
    {
        this.id = id;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void orderInfo()
    {
        System.out.println("订单编号：" + this.id+",订单状态：" + this.state);
        if(this.person!=null)
        {
            System.out.println("配送员信息：");
        }
    }

}
