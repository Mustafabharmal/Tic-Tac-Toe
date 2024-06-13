import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class PlayerFrame extends Frame
{
    Label l1,l2;
    TextField t1,t2;
    Button bsave;
    PlayerController pl = new PlayerController(this);

    PlayerFrame()
    {
        super("Enter Your Information to Play");
        setLayout(null);
        setBounds(0,0,950,650);

        l1 = new Label("Player 1");
        l2 = new Label("Player 2");

        t1 = new TextField();
        t2 = new TextField();

        bsave = new Button("Save");

        Font f1 = new Font("Arial",Font.BOLD,40);

        l1.setFont(f1);
        l2.setFont(f1);
        t2.setFont(f1);
        t1.setFont(f1);
        bsave.setFont(f1);


        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(bsave);

        l1.setBounds(100,100,300,100);
		l2.setBounds(100,300,300,100);
		t1.setBounds(450,100,400,100);
		t2.setBounds(450,300,400,100);
		bsave.setBounds(350,450,250,100);
		

        bsave.addActionListener(pl);
        t1.addActionListener(pl);
        t2.addActionListener(pl);
        
    }
}