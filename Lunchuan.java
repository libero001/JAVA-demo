import java.util.Scanner;

class DangerEXception extends Exception
{
    private String s;
    DangerEXception()
    {
        super();
    }
    DangerEXception(String s)
    {
        this.s=s;
    }
    public void  warn()
    {
        System.out.println(this.s);
    }
}

 class Lunchuan {

     private double maxContent;
     private double realContent;

     public Lunchuan(double maxContent, double realContent) {
         this.maxContent = maxContent;
         this.realContent = realContent;
     }

     public void loading(int m) throws DangerEXception {

         this.realContent += m;
         if (m > this.maxContent) {
             throw new DangerEXception("轮船超重");
         }


     }

     public double getMaxContent() {
         return maxContent;
     }

     public void setMaxContent(double maxContent) {
         this.maxContent = maxContent;
     }

     public double getRealContent() {
         return realContent;
     }

     public void setRealContent(double realContent) {
         this.realContent = realContent;
     }
 }


