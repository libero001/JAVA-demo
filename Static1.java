public class Static1 {
    static double sum_water;
    double Water;
    Static1()
    {
        Water=0;
        sum_water=0;
    }
    Static1(double w)
    {
        this.Water=w;
        sum_water+=w;
    }

    public static double getSum_water() {
        return sum_water;
    }

    public double getWater() {
        return Water;
    }

    public static void setSum_water(double sum_water) {
        Static1.sum_water = sum_water;
    }

    public void setWater(double water) {
        Water = water;
        
    }
    public static void Print()
    {
        System.out.println(getSum_water());
    }

}

