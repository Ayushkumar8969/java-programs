class Question{
                    int queNo;
                    String que,optionA,optionB,optionC,optionD;
                    char answer;
                    public void setQuestion(int x,String q,String a,String b,String c,String d,char ans)
                    {
                            queNo=x;
                            que=q;
                            optionA=a;
                            optionB=b;
                            optionC=c;
                            optionD=d;
                            answer=ans;
                    }
                    public void displayQuestions()
                    {
                            System.out.println("Que No:"+queNo);
                            System.out.println("Question:"+que);
                            System.out.println("(A):"+optionA);
                            System.out.println("(B):"+optionB);
                            System.out.println("(C):"+optionC);
                            System.out.println("(D):"+optionD);
                            System.out.println("ANSWER:"+answer);
                    }
}
public class QuestionDemo {
                 public static void main(String[] args) {
                          Question q1=new Question();
                          q1.setQuestion(1,"What is capital city of India?","Hyderabad","Delhi","Mumbai", "Chennai",'B');
                          q1.displayQuestions();
                 }
}
