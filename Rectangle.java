 class Rectangle extends Geometry{
    double width,length;
    Rectangle(String name ,String color,double width,double length)
    {
        super(name,color);
        this.length=length;
        this.width=width;
    }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
        if(width<0)return;
         this.width = width;
     }

     public double getLength() {

         return length;
     }

     public void setLength(double length) {
         if(length<0)return;
         this.length = length;
     }
     public double getArea()
     {
         return length*width;
     }

 }
