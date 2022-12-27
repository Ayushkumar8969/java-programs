class Contact{
                    int id;
                    String firstName,lastName,emailId,mobileNo;
                    public void setId(int x)
                    {
                          id=x;
                    }
                    public void setFirstName(String str)
                    {
                           firstName=str;
                    }
                    public void setLastName(String str)
                    {
                          lastName=str;
                    }
                    public void setEmailId(String str)
                    {
                          emailId=str;
                    }
                    public void setMobileNo(String str)
                    {
                          mobileNo=str;
                    }
                       public int getId()
                       {
                            return id;
                       }
                       public String getFirstName()
                       {
                             return firstName;
                       }
                       public String getLastName()
                       {
                             return lastName;
                       }
                       public String getEmailId()
                       {
                             return emailId;
                       }
                       public String getMobileNo()
                       {
                             return mobileNo;
                       }
                     
}
public class ContactDetails {
                 public static void main(String[] args) {
                         Contact c1=new Contact();
                            c1.setId(518);
                            c1.setFirstName("Ayush");
                            c1.setLastName("Kumar");
                            c1.setEmailId("ayushkumar777889@gmail.com");
                            c1.setMobileNo("8252598701");
                            System.out.println("ID:"+c1.getId());
                            System.out.println("First_Name:"+c1.getFirstName());
                            System.out.println("Last_Name:"+c1.getLastName());
                            System.out.println("EMAIL_ID:"+c1.getEmailId());
                            System.out.println("MOBILE_NO:"+c1.getMobileNo());

            }
}
