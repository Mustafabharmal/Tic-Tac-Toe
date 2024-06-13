import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import java.lang.*;

class GameFrame extends Frame 
{
    JButton b1;
    JButton b2,b3,b4,b5,b6,b7,b8,b9;
    GameController ml = new GameController(this);
    GameFrame()
    {
        super("GameFrame");
        setLayout(null);
        setBounds(0,0,800,800);

        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
   
        b1.setBounds(100,500,200,200);
        b2.setBounds(300,500,200,200);
        b3.setBounds(500,500,200,200);
        b4.setBounds(100,300,200,200);
        b5.setBounds(300,300,200,200);
        b6.setBounds(500,300,200,200);
        b7.setBounds(100,100,200,200);
        b8.setBounds(300,100,200,200);
        b9.setBounds(500,100,200,200);

        Font f1 = new Font("SANS_SERIF",Font.BOLD,90);

		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		b8.setFont(f1);
		b9.setFont(f1);

        b1.addActionListener(ml);
        b2.addActionListener(ml);
        b3.addActionListener(ml);
        b4.addActionListener(ml);
        b5.addActionListener(ml);
        b6.addActionListener(ml);
        b7.addActionListener(ml);
        b8.addActionListener(ml);
        b9.addActionListener(ml);
    }

}