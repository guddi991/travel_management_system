
package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash {
    public static void main(String[] args){
        SplashFrame Frame = new SplashFrame();
        Frame.setVisible(true);
        int x=1;
        for(int i = 1;i <= 700; i+=6, x+=7){
            Frame.setLocation(950 - (x+i)/2, 500 - (i/2));
            Frame.setSize(x + i, i);
            try{
                Thread.sleep(10);
                
            }catch(Exception e){}
            
        }
        Frame.setVisible(true);
        
    }  
}


class SplashFrame extends JFrame implements Runnable{
    
    Thread t1; // declare
    SplashFrame(){
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/Splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1600,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3); 
        add(l1);
        
        
        //setBounds(200, 200, 1600, 700); //2 argu for Location, 2 argu for size
        setUndecorated(true);
        t1=new Thread(this); 
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            new Login().setVisible(true);
            
        }catch(Exception e){}

    }
}

