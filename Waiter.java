public class Waiter extends Person {
    Waiter(String name,String job)
    {
      super(name,job);
    }
    public void orderProcessing(Order order)
    {
        super.orderProcessing(order);
        System.out.println(this.getJob()+this.getName()+"接单！");
    }
}

