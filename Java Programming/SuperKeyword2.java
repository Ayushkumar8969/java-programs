// super can call super class constructor from sub class constructor 
class Box 
{
                         double width,height,depth; 
                         Box() 
                         {
                               width=10;
                               height=20;
                               depth=30;
                         }
                         void volume() 
                         {
                                 System.out.println(width*height*depth);
                         }
}
class BoxWeight extends Box
{
                           double weight;
                           BoxWeight()
                           {
                                   super();
                                   weight=10;
                           }
                           void displayWeight()
                           {
                                    System.out.println(weight);
                           }
}
class SuperDemo 
{
                    public static void main(String[] args) 
                    {
                                BoxWeight obj=new BoxWeight();
                                 obj.volume();
                                 obj.displayWeight();
                    }
}