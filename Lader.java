 class Lader extends Geometry{
    double above,bottom,height;
    Lader(String name ,String color,double above, double bottom,  double height)
    {
        super(name,color);
        this.above=above;
        this.bottom=bottom;
        this.height=height;
    }

     public double getAbove() {
         return above;
     }

     public void setAbove(double above) {
         this.above = above;
     }

     public double getBottom() {
         return bottom;
     }

     public void setBottom(double bottom) {
         this.bottom = bottom;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
     public double getArea()
     {
         return (above+bottom)*height/2.0;
     }
 }
