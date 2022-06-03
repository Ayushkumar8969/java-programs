import java.util.Scanner;
class Grades
{
    public static void main(String []args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        marks=sc.nextInt();
          if(marks>=90)
          {
              System.out.println("+A");
          }
          else if(marks>=80)
          {
              System.out.println("A");
          }
          else if(marks>=70)
          {
              System.out.println("+B");
          }
          else if(marks>=60)
          {
              System.out.println("B");
          }
          else{
              System.out.println("Fail");
          }

    }
}