 class MotorVhcle {
    private String name;
    MotorVhcle(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String info()
    {
        return "名字"+this.name;
    }
}
class Car extends  MotorVhcle
{
    private String color;
   public  Car(String name,String color)
    {
        super(name);
        this.setColor(color);

    }
    public void setColor (String color)
    {
        this.color=color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String info()
    {
        return super.info()+",颜色："+this.getColor();
    }
}

