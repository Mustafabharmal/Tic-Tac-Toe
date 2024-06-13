import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class GameController implements  ActionListener 
{
    GameFrame gf;
    int i = 1;
    int t = 0;

    GameController(GameFrame g)
    {
        this.gf = g;
    }
    public void actionPerformed(ActionEvent e)
    {
        char ch[] = new char[50];
        try
        {
            FileReader f = new FileReader("players.txt");
            f.read(ch);
            f.close();
        }
        catch(Exception ae)
        {

        }
        String records = new String(ch);
        String record[] = records.split("#");
        String player1 = record[0];
        String player2 = record[1];

        if(i == 1 || i == 3 || i == 5 || i == 7 || i == 9 )
        {
            if(e.getSource().equals(this.gf.b1))
            {
                this.gf.b1.setText("X");
                this.gf.b1.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b2))
            {
                this.gf.b2.setText("X");
                this.gf.b2.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b3))
            {
                this.gf.b3.setText("X");
                this.gf.b3.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b4))
            {
                this.gf.b4.setText("X");
                this.gf.b4.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b5))
            {
                this.gf.b5.setText("X");
                this.gf.b5.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b6))
            {
                this.gf.b6.setText("X");
                this.gf.b6.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b7))
            {
                this.gf.b7.setText("X");
                t=t+1;
                this.gf.b7.setEnabled(false);
            }
            if(e.getSource().equals(this.gf.b8))
            {
                this.gf.b8.setText("X");
                this.gf.b8.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b9))
            {
                this.gf.b9.setText("X");
                this.gf.b9.setEnabled(false);
                t=t+1;
            }
            if(this.gf.b1.getText() == "X" && this.gf.b2.getText() == "X" && this.gf.b3.getText() == "X" || this.gf.b1.getText() == "X" && this.gf.b4.getText() == "X" && this.gf.b7.getText() == "X" ||this.gf.b1.getText() == "X" && this.gf.b5.getText() == "X" && this.gf.b9.getText() == "X" || this.gf.b2.getText() == "X" && this.gf.b5.getText() == "X" && this.gf.b8.getText() == "X" ||this.gf.b3.getText() == "X" && this.gf.b5.getText() == "X" && this.gf.b7.getText() == "X" || this.gf.b3.getText() == "X" && this.gf.b6.getText() == "X" && this.gf.b9.getText() == "X" || this.gf.b4.getText() == "X" && this.gf.b5.getText() == "X" && this.gf.b6.getText() == "X" || this.gf.b7.getText() == "X" && this.gf.b8.getText() == "X" && this.gf.b9.getText() == "X" )
            {
                i = i+ 10;
                t= t+10;
                System.out.println("x win");
                System.out.println(player1);
                JOptionPane.showMessageDialog(this.gf, "Won By: "+ player1,"Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(i == 2 || i == 4 || i == 6 || i == 8 || i== 10 )
        {
            if(e.getSource().equals(this.gf.b1))
            {
                this.gf.b1.setText("0");
                this.gf.b1.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b2))
            {
                this.gf.b2.setText("0");
                this.gf.b2.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b3))
            {
                this.gf.b3.setText("0");
                this.gf.b3.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b4))
            {
                this.gf.b4.setText("0");
                this.gf.b4.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b5))
            {
                this.gf.b5.setText("0");
                this.gf.b5.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b6))
            {
                this.gf.b6.setText("0");
                this.gf.b6.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b7))
            {
                this.gf.b7.setText("0");
                this.gf.b7.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b8))
            {
                this.gf.b8.setText("0");
                this.gf.b8.setEnabled(false);
                t=t+1;
            }
            if(e.getSource().equals(this.gf.b9))
            {
                this.gf.b9.setText("0");
                this.gf.b9.setEnabled(false);
                t=t+1;
            }
            if(this.gf.b1.getText() == "0" && this.gf.b2.getText() == "0" && this.gf.b3.getText() == "0" || this.gf.b1.getText() == "0" && this.gf.b4.getText() == "0" && this.gf.b7.getText() == "0" ||this.gf.b1.getText() == "0" && this.gf.b5.getText() == "0" && this.gf.b9.getText() == "0" || this.gf.b2.getText() == "0" && this.gf.b5.getText() == "0" && this.gf.b8.getText() == "0" ||this.gf.b3.getText() == "0" && this.gf.b5.getText() == "0" && this.gf.b7.getText() == "0" || this.gf.b3.getText() == "0" && this.gf.b6.getText() == "0" && this.gf.b9.getText() == "0" || this.gf.b4.getText() == "0" && this.gf.b5.getText() == "0" && this.gf.b6.getText() == "0" || this.gf.b7.getText() == "0" && this.gf.b8.getText() == "0" && this.gf.b9.getText() == "0" )
            {
                i = i+10;
                t= t+10;
                System.out.println("0 WIns");
                System.out.println(player2);
                JOptionPane.showMessageDialog(this.gf, "Won By: "+player2,"Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        i = i+1; 
        if(t == 9 )
        {
            JOptionPane.showMessageDialog(this.gf, "Match Is Draw","Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}