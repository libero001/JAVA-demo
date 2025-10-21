import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Lunchuan boat = new Lunchuan(1000, 100);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请选择是否装载货物：0.不装载  1.装载");
            int choice = sc.nextInt();
            if(choice==1)
            {
                System.out.println("输入装载货物重量");
                int i = sc.nextInt();
                try {
                    boat.loading(i);
                } catch (DangerEXception e) {
                    e.warn();
                    try
                    {
                        boat.loading(-i);
                    }
                    catch (DangerEXception e2) {
                        System.exit(0);
                    }
                    System.out.println("当前货物总重："+boat.getRealContent());
                    break;
                }

            }
            else if(choice==0)
            {
                System.out.println("当前货物总重："+boat.getRealContent());
                break;
            }

        }
        System.out.println("货船正点出发");

    }


}
