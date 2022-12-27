class Complex{
                int real,imaginary;
                void setComplex(int x,int y)
                {
                     real=x;
                     imaginary=y;
                }
                void printComplex()
                {
                     System.out.println(real+"+"+imaginary+"i");
                }
}
public class ComplexNumber {
               public static void main(String[] args){
                      Complex obj=new Complex();
                      obj.setComplex(3, 4);
                      obj.printComplex();
               }
}
