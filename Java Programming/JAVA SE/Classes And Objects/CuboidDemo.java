class Cuboid{
               int length,width,height;
               void setLength(int l)
               {
                      length=l;
               }
               void setWidth(int w)
               {
                    width=w;
               }
               void setHeight(int h)
               {
                     height=h;
               }
               int getLength()
               {
                    return length;
               }
               int getWidth()
               {
                    return width;
               }
               int getHeight()
               {
                    return height;
               }
               int getVolume()
               {
                     return length*width*height;
               }
               int getSurfaceArea()
               {
                       return 2*(length*width+length*height+height*width);
               }
}
public class CuboidDemo {
                      public static void main(String[] args) {
                            Cuboid c1=new Cuboid();
                            c1.setLength(10);
                            c1.setWidth(15);
                            c1.setHeight(12);
                            System.out.println("Length="+c1.getLength());
                            System.out.println("Width="+c1.getWidth());
                            System.out.println("Height="+c1.getHeight());
                            System.out.println("Surface Area="+c1.getSurfaceArea());
                            System.out.println("Volume="+c1.getVolume());
                      }
}
