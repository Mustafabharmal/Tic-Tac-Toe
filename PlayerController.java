import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class PlayerController implements  ActionListener 
{
    String player1, player2;
    PlayerFrame pf;
    PlayerController(PlayerFrame p)
    {
        this.pf = p;
    }
    PlayerController(String a , String b)
    {
        this.player1 = a;
        this.player2 = b;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(this.pf.bsave))
        {
            player1 = this.pf.t1.getText();
            player2 = this.pf.t2.getText();
            this.pf.setVisible(false);
        }
        String value = player1 + "#" + player2;
        try 
        {
            FileWriter fw = new FileWriter("players.txt");
            fw.write(value);
            fw.close();
        }
        catch(Exception ae)
        {

        }
    }
}