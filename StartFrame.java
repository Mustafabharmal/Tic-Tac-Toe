import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import java.lang.*;

class StartFrame extends Frame
{
    MenuBar mb1;
    Menu m1;
    MenuItem mi1,mi2;
    Label l1;
	StartController sl = new StartController(this);
    StartFrame()
    {
        super("TIC-TAC-TOE");
        setLayout(null);
        setBounds(0,0,900,400);
        
        l1 = new Label("Lets Play TIC-TAC-TOE");
        mi1 = new MenuItem("Player Name");

        mi2 = new MenuItem("Start Game");
        mi2.setEnabled(false);

        m1 = new Menu("Start");

        mb1 = new MenuBar();

        Font f1 = new Font("Arial",Font.BOLD,60);
        l1.setFont(f1);
        add(l1);
        l1.setBounds(100,100,700,100);
        m1.add(mi1);
		m1.add(mi2);
		
		mb1.add(m1);
		
		setMenuBar(mb1);

      

        mi1.addActionListener(sl);
		mi2.addActionListener(sl);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) throws Exception
	{
        StartFrame mf = new StartFrame();
		mf.setVisible(true);
    }
}