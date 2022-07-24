class StringFunctions
{
                                             public static void main(String[] args)
                                             {
                                                                         String str="OkGoogle";
                                                               System.out.println("Length="+str.length());
                                                                 System.out.println("character at 3rd position:"+str.charAt(4));
                                                                     System.out.println("substring="+str.substring(3));
                                                              System.out.println("substring from position:"+str.substring(2,5));
                                                                             String s1="ayush";
                                                                             String s2="kumar";
                                                                      System.out.println("Concatenation="+s1.concat(s2));
                                                                         String s3="Hello";
                                                                      System.out.println("Upper Case:"+s3.toUpperCase());
                                                                       System.out.println("Lower Case:"+s3.toLowerCase());
                                                                             String s4="Ayush";
                                                                             String s5="Ayush";
                                                                                     System.out.println(s4==s5);
                                                                                     System.out.println(s4.equals(s5));
                                                                               String s6=new String("Krishna");
                                                                                String s7=new String("Krishna");
                                                                             System.out.println(s6==s7);
                                                                             System.out.println(s6.equals(s7));
                                                                                     String s8="Good";
                                                                                     String s9="good";
                                                                             System.out.println(s8.equalsIgnoreCase(s9));
                                                                                      String s10="Ayush";
                                                                                      String s11="adarsh";
                                                                             System.out.println(s10.compareTo(s11));
                                                                                System.out.println(s10.compareToIgnoreCase(s11));
                                                                                        String s12="       Learn Share Learn           ";
                                                                             System.out.println(s12.trim());
                                                                                   
                                             }
}