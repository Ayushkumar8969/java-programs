class Distance{
                     int km,m,cm;
                     public void setDistance(int x,int y,int z)
                     {
                             km=x;
                             m=y;
                             cm=z;
                     }
                     public void displayDistance()
                     {
                               System.out.println(km+"km "+m+"m "+cm+"cm");
                     }
                     public Distance addTwoDistance(Distance d)
                     {
                                 Distance temp=new Distance();
                                    temp.cm=cm+d.cm;
                                   temp.m=temp.cm/100+m+d.m;
                            temp.cm=temp.cm%100;
                                   temp.km=temp.m/1000+km+d.km;
                            temp.m=temp.m%1000;
                                 return temp;
                     }
}
public class DistanceDetails {
                     public static void main(String[] args) {
                           Distance d1=new Distance();
                           Distance d2=new Distance();
                             d1.setDistance(5,120, 65);
                              d2.setDistance(3,250,85);
                              Distance d3;
                              d3=d1.addTwoDistance(d2);
                              d3.displayDistance();
                     }
}
