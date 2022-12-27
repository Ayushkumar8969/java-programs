class Employee{
                  int empId;
                  String name;
                  Float salary;
                      public void setEmpId(int x)
                      {
                            empId=x;
                      }
                      public void setName(String str)
                      {
                           name=str;
                      }
                      public void setSalary(Float y)
                      {
                           salary=y;
                      }
                      public int getEmpId()
                      {
                           return empId;
                      }
                      public String getName()
                      {
                             return name;
                      }
                      public Float getSalary()
                      {
                            return salary;
                      }

}
public class EmployeDetails {
                        public static void main(String[] args) {
                                Employee emp1=new Employee();
                                emp1.setEmpId(503);
                                emp1.setName("Ayush");
                                emp1.setSalary(12000.652f);
                                System.out.println("EMP_ID:"+emp1.getEmpId());
                                System.out.println("NAME:"+emp1.getName());
                                System.out.println("SALARY:"+emp1.getSalary());
                        }
}
