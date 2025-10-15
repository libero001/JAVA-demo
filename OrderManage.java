import java.util.Scanner;

public class OrderManage {
    public static void main(String[] args)
    {
        Order order01=new Order("0001","待配送");
        Order order02=new Order("0002","待配送");
        Order []orders={order01,order02};
        Person d1=new Waiter("张三","服务员");
        Person d2=new Deliveryman("李四","配送员");
        int count =orders.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("------订单管理------");
        for(int i=0;i<count;i++)
        {
            Order o=orders[i];
            o.orderInfo();
        }
        System.out.println("是否对订单进行处理（y/n）:");
        String flag=sc.next();
        if(flag.equals("y")) {
            for (int i = 0; i < orders.length; i++) {
                d1.orderProcessing(orders[i]);
                d2.orderProcessing(orders[i]);
                count--;
            }
            if(count==0)
            {
                System.out.println("所有订单已配送");
            }
        }
        else
        {
            System.out.println("订单暂不处理！");
            System.exit(0);
        }
    }
}
