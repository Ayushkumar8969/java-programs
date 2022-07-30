import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="ButtonDemo" width=500 height=600>
   </applet code>
*/
public class ButtonDemo extends Applet implements ActionListener 
{
                        String msg="";
                        Button yes,no,maybe;
                        public void init()
                        {
                                        yes=new Button("YES");
                                        no=new Button("NO");
                                        maybe=new Button("MAY BE");
                                        add(yes);
                                        add(no);
                                        add(maybe);
                                        yes.addListener(this);
                                        no.addListener(this);
                                        maybe.addListener(this);
                        }
                           public void actionPerformed(ActionEvent ae)
                           {
                                           String=ae.getActionCommand();
                                             if(str.equals("YES"))
                                             {
                                                    msg="U PRESSED YES";
                                             }
                                              else if(str.equals("NO"))
                                              {
                                                   msg="U PRESSED NO";
                                              }
                                              else 
                                              {
                                                   msg="U PRESSED MAYBE"; 
                                              }
                                              repaint();
                           }
                           public void paint(Graphics g)
                           {
                                    g.drawString(msg,50,50);
                           }
}