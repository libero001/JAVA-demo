public class Deliveryman extends Person implements Delivery
{
    public Deliveryman(String name,String job)
    {
        super(name,job);
    }
    @Override
    public  void orderProcessing(Order order)
    {
        deliver(order);
    }
    @Override
    public void deliver(Order order)
    {
        System.out.println(getJob()+getName()+"在配送订单号为"+order.getId()+"的订单！");
    }


}
