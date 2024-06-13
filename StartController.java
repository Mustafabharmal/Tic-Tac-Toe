import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class StartController implements  ActionListener 
{
    StartFrame sf;
    PlayerFrame pf;
    GameFrame gf;
    StartController (StartFrame s)
    {
        this.sf = s;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Player Name"))
        {
            pf = new PlayerFrame();
            this.pf.setVisible(true);
            this.sf.mi1.setEnabled(false);
            this.sf.mi2.setEnabled(true);
        }
        if(e.getActionCommand().equals("Start Game"))
        {
            gf = new GameFrame();
            this.gf.setVisible(true);
            this.sf.mi2.setEnabled(false);
        }
    }
}