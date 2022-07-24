import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="KeyHandling" width=500 height=400>
   </applet>
*/ 
public class KeyHandling extends Applet implements KeyListener 
{
                          String msg="";
                        int x=10,y=20;
                     public void init()
                     {
                          addKeyListener(this);
                     }
                       public void KeyPressed(KeyEvent ke) 
                       {
                               showStatus("Key Down");
                       }
                       public void KeyReleased(KeyEvent ke) 
                       {
                               showStatus("Key up");
                       }
                       public void KeyTyped(KeyEvent ke) 
                       {
                               msg=msg+ke.getKeyChar();
                               repaint();
                       }
                       public void paint(Graphics g) 
                       {
                               g.drawString(msg,x,y); 
                       }
}