class Time{
              int hour,minutes,second;
              void setTime(int x,int y,int z)
              {
                   hour=x;
                   minutes=y;
                   second=z;
              }
              void showTime()
              {
                    System.out.println(hour+":"+minutes+":"+second);
              }
}
public class TimeWorld {
               public static void main(String[] args) {
                      Time t1=new Time();
                      t1.setTime(3,45,20);
                      t1.showTime();
               }
}
