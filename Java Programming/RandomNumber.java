import java.util.Random;
class Number extends Thread 
{
                                 Number()
                                 {
                                         start();
                                 }
                                  public void run()
                                  {
                                           Random r=new Random();
                                            for(int i=0;i<10;i++)
                                            {
                                                     int val=r.nextInt(100);
                                                     System.out.println("Random Integer Generated" + " "+val);
                                                     if(val%2==0)
                                                     {
                                                             Square s=new Square(val);
                                                             s.start();
                                                     }
                                                     else 
                                                     {
                                                             Cube c=new Cube(val);
                                                             c.start();
                                                     }
                                                      try{
                                                            Thread.sleep(1000);
                                                      }
                                                      catch(InterruptedException e)
                                                      {
                                                            System.out.println("Child Thread");
                                                      }
                                            }
                                  }
}
class Square extends Thread 
{
                                           int x;
                                           Square(int a)
                                           {
                                                   x=a;
                                           }
                                            public void run()
                                            {
                                                   System.out.println("Square of Number="+x*x);
                                            }
}
class Cube extends Thread 
{
                                          int x;
                                          Cube(int n)
                                          {
                                              x=n;
                                          }
                                          public void run()
                                          {
                                                  System.out.println("Cube of Number="+x*x*x);
                                          }
}
class RandomThreadDemo 
{
                              public static void main(String[] args)
                              {
                                           Number obj=new Number();
                              }
}