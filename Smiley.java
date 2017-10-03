import java.applet.*;
import java.awt.*;
public class Smiley extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,100,300,300);
g.fillOval(170,200,40,40);
g.fillOval(280,200,40,40);
g.drawLine(250,250,250,310);
g.drawArc(200,265,100,100,180,180);
g.drawArc(200,265,100,90,180,180);
}
}
//<applet code=Smiley width=500 height=500></applet>