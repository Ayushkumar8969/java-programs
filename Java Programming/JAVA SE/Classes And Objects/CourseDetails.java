class Course{
                 int courseId;
                 String courseName;
                 int duration;
                 Float fee;
                    public void setCourseId(int x)
                    {
                             courseId=x;
                    }
                    public void setCourseName(String str)
                    {
                            courseName=str;
                    }
                    public void setDuration(int t)
                    {
                            duration=t;
                    }
                    public void setFee(Float y)
                    {
                            fee=y;
                    }
                    public int getCourseId()
                    {
                           return courseId;
                    }
                    public String getCourseName()
                    {
                          return courseName;
                    }
                    public int getDuration()
                    {
                          return duration;
                    }
                    public Float getFee()
                    {
                           return fee;
                    }
}
public class CourseDetails {
                     public static void main(String[] args) {
                              Course c=new Course();
                              c.setCourseId(123);
                              c.setCourseName("JAVA");
                              c.setDuration(2);
                              c.setFee(2400.55f);
                              System.out.println("Course_Id:"+c.getCourseId());
                              System.out.println("Course_Name:"+c.getCourseName());
                              System.out.println("Duration:"+c.getDuration()+"hr");
                              System.out.println("FEE:"+c.getFee());
                     }
}
