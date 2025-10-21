 class Dish {
  String name;
  double price;
    void  dishInfo()
   {
       System.out.println(name+":"+price);
   }
Dish (String s,double p)
{
    name=s;
    price=p;
}
     Dish ()
     {
         name=null;
         price=0.0;
     }
}


