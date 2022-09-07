class Student 
{
                    String name;
                    int rollno;
                    Student(String name,int rollno)
                    {
                             this.name=name;
                             this.rollno=rollno;
                    }
                    void display()
                    {
                            System.out.println(name+" "+rollno);
                    }
}
class StudentDemo 
{
                          public static void main(String[] args) 
                          {
                                             Student obj1=new Student("Ayush",501);
                                                obj1.display();
                                             Student obj2=new Student("Adarsh",502);
                                                obj2.display();
                          }
}