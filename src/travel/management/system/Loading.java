
package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
    
    JProgressBar p;
    Thread t;
    String username;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int m = p.getMaximum();
                int n= p.getValue();
                if(n<m){
                    p.setValue(p.getValue() + 1);
                    
                }else{
                    i=101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
            
        }catch(Exception e){}
    }
    
    
    Loading(String user){
        username = user;
        t=new Thread(this);
        
        
        setBounds(360,100,650,400);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setBackground(new Color(0, 128, 111));
        setLayout(null);
        
        JLabel l1 = new JLabel("Travel and Tourism Application");
        l1.setBounds(50,20,600,40);
        l1.setFont(new Font("Raleway",Font.BOLD,35));
        l1.setForeground(Color.BLACK);
        add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150,100,300,25);
        add(p);
        
        JLabel l2 = new JLabel("Please wait...");
        l2.setBounds(255,130,120,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome "+username);
        l3.setBounds(20,310,400,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        l3.setForeground(Color.WHITE);
        add(l3);
        
        t.start();
    }
    public static void main(String[] args){
        new Loading(" ").setVisible(true);
    }
    
}
