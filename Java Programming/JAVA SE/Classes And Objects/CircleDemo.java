class Circle{
                   float radius;
                    public void setRadius(float r)
                    {
                          radius=r;
                    }
                    public float getArea()
                    {
                          return 3.14f*radius*radius;
                    }
                    public float getCircumference()
                    {
                          return 2*3.14f*radius;
                    }
}
public class CircleDemo{
                           public static void main(String[] args) {
                                    Circle c=new Circle();
                                    c.setRadius(5.8f);
                                    System.out.println("Area="+c.getArea());
                                    System.out.println("Circumference:"+c.getCircumference());
                           }
}