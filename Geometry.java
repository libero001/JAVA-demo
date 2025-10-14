public abstract  class Geometry {
    String name;
    String color;
    public Geometry(String name ,String color)
    {
        this.name=name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract  double getArea();//抽象方法 求面积
}

