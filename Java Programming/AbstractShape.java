abstract class Shape
{
                                       int x=10,y=20;
                                     abstract void printArea();
}
class Rectangle extends Shape
{
                                      void  printArea()
                                      {
                                                  //  x=10;y=20;
                                            System.out.println("Area="+(x*y));
                                      }

}
class Triangle extends Shape
{
                                          void printArea()
                                          {
                                                   //  x=4;y=5;
                                                 System.out.println("Area="+(0.5*x*y));
                                          }
}
class Circle extends Shape
{
                                            void printArea()
                                           {
                                                 //  x=10;
                                                 System.out.println("Area="+(3.14*x*x));
                                           }
}
class Test
{
                                           public static void main(String[] args)
                                          {
                                                       Shape obj;
                                                      obj=new Rectangle();
                                                        obj.printArea();
                                                      obj=new Triangle();
                                                         obj.printArea();
                                                    obj=new Circle();
                                                          obj.printArea();
                                          }
}