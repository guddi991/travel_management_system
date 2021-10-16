
package travel.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Paytm extends JFrame{
    Paytm(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
        try{
            j.setPage("https://paytm.com/electricity-bill-payment");
            
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("<html>could not load,error 404 </html>");
        }
        
        
        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        
        
        
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
        back.setBounds(610,20,80,40);
        j.add(back);
        
        setSize(800,600);
        setLocation(250,120);
        setVisible(true);
        
        
    
        //setBounds(270,120,800,600);
    }
    
    public static void main(String[] args){
        new Paytm().setVisible(true);
    }
}
