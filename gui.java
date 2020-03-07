import java.awt.event.*;
import javax.swing.*;
public class gui extends JFrame implements ActionListener
{
    JFrame fr=new JFrame("LED");
    JPanel p=new JPanel();
    JButton on=new JButton("ON");
    JButton off=new JButton("OFF");

    gui()
    {
        p.add(on);
        p.add(off);
        fr.setSize(35,100);
        fr.add(p);
        fr.setVisible(true);
        on.addActionListener(this);
        off.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        work obj=new work();
        if(evt.getSource()==on)
        {
            obj.on();
        }
        else
        {
            obj.off();
        }
    }
    public static void main(String args[])
    {
        new gui();
    }
}