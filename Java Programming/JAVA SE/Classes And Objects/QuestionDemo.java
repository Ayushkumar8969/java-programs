class Question{
                    int queNo;
                    String que,optionA,optionB,optionC,optionD;
                    public void setQuestion(int x,String str1,String str2,String str3,String str4,String str5)
                    {
                            queNo=x;
                            que=str1;
                            optionA=str2;
                            optionB=str3;
                            optionC=str4;
                            optionD=str5;
                    }
                    public void displayQuestions()
                    {
                            System.out.println("Question No:"+queNo);
                            System.out.println("Question:"+que);
                            System.out.println("Option A:"+optionA);
                            System.out.println("Option B:"+optionB);
                            System.out.println("Option C:"+optionC);
                            System.out.println("Option D:"+optionD);
                    }
}
public class QuestionDemo {
                 public static void main(String[] args) {
                          Question q1=new Question();
                          q1.setQuestion(1,"What is capital city of India?","Hyderabad","Delhi","Mumbai", "Chennai");
                          q1.displayQuestions();
                 }
}
