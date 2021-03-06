
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
                
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,3050,65);
        p1.setBackground(new Color(0, 128, 111));
        //p1.setBackground(new Color(0,0,102));
        add(p1);
        /*
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest1.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5,0,70,70);
        p1.add(l2);
        */
        
        JLabel l3 = new JLabel("Dashboard");
        l3.setFont(new Font("Cursive",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80,10,300,40);
        p1.add(l3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        p2.setBackground(new Color(0, 128, 111));
        //p2.setBackground(new Color(0,0,102));
        add(p2);
        
        
        b1 = new JButton("Add personal Details");
        b1.setBackground(new Color(0, 128, 111));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setForeground(Color.BLACK);
        b1.setMargin(new Insets(0,0,0,60));
        b1.setBounds(0,0,300,50);
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Update personal Details");
        b2.setBackground(new Color(0, 128, 111));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.setForeground(Color.BLACK);
        b2.setMargin(new Insets(0,0,0,30));
        b2.setBounds(0,40,300,50);
        b2.addActionListener(this);
        p2.add(b2);
        
        
        b3 = new JButton("View Details");
        b3.setBackground(new Color(0, 128, 111));
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setForeground(Color.BLACK);
        b3.setMargin(new Insets(0,0,0,130));
        b3.setBounds(0,80,300,50);
        b3.addActionListener(this);
        p2.add(b3);
        
        
        b4 = new JButton("Delete personal Details");
        b4.setBackground(new Color(0, 128, 111));
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setForeground(Color.BLACK);
        b4.setMargin(new Insets(0,0,0,33));
        b4.setBounds(0,120,300,50);
        b4.addActionListener(this);
        p2.add(b4);
        
        
        b5 = new JButton("Check Package");
        b5.setBackground(new Color(0, 128, 111));
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setForeground(Color.BLACK);
        b5.setMargin(new Insets(0,0,0,110));
        b5.setBounds(0,160,300,50);
        b5.addActionListener(this);
        p2.add(b5);
        
        
        b6 = new JButton("Book Package");
        b6.setBackground(new Color(0, 128, 111));
        b6.setFont(new Font("Tahoma",Font.PLAIN,20));
        b6.setForeground(Color.BLACK);
        b6.setMargin(new Insets(0,0,0,120));
        b6.setBounds(0,200,300,50);
        b6.addActionListener(this);
        p2.add(b6);
        
        
        b7 = new JButton("View Package");
        b7.setBackground(new Color(0, 128, 111));
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setForeground(Color.BLACK);
        b7.setMargin(new Insets(0,0,0,120));
        b7.setBounds(0,240,300,50);
        b7.addActionListener(this);
        p2.add(b7);
        
        
        b8 = new JButton("View Hotels");
        b8.setBackground(new Color(0, 128, 111));
        b8.setFont(new Font("Tahoma",Font.PLAIN,20));
        b8.setForeground(Color.BLACK);
        b8.setMargin(new Insets(0,0,0,130));
        b8.setBounds(0,280,300,50);
        b8.addActionListener(this);
        p2.add(b8);
        
        
        b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(0, 128, 111));
        b9.setFont(new Font("Tahoma",Font.PLAIN,20));
        b9.setForeground(Color.BLACK);
        b9.setMargin(new Insets(0,0,0,140));
        b9.setBounds(0,320,300,50);
        b9.addActionListener(this);
        p2.add(b9);
        
        
        b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(0, 128, 111));
        b10.setFont(new Font("Tahoma",Font.PLAIN,20));
        b10.setForeground(Color.BLACK);
        b10.setMargin(new Insets(0,0,0,70));
        b10.setBounds(0,360,300,50);
        b10.addActionListener(this);
        p2.add(b10);
        
        
        b11 = new JButton("Destinations");
        b11.setBackground(new Color(0, 128, 111));
        b11.setFont(new Font("Tahoma",Font.PLAIN,20));
        b11.setForeground(Color.BLACK);
        b11.setMargin(new Insets(0,0,0,125));
        b11.setBounds(0,400,300,50);
        b11.addActionListener(this);
        p2.add(b11);
        
        
        b12 = new JButton("Payment");
        b12.setBackground(new Color(0, 128, 111));
        b12.setFont(new Font("Tahoma",Font.PLAIN,20));
        b12.setForeground(Color.BLACK);
        b12.setMargin(new Insets(0,0,0,155));
        b12.setBounds(0,440,300,50);
        b12.addActionListener(this);
        p2.add(b12);
        
        
        b13 = new JButton("Calculator");
        b13.setBackground(new Color(0, 128, 111));
        b13.setFont(new Font("Tahoma",Font.PLAIN,20));
        b13.setForeground(Color.BLACK);
        b13.setMargin(new Insets(0,0,0,145));
        b13.setBounds(0,480,300,50);
        b13.addActionListener(this);
        p2.add(b13);
        
        
        b14 = new JButton("Notepad");
        b14.setBackground(new Color(0, 128, 111));
        b14.setFont(new Font("Tahoma",Font.PLAIN,20));
        b14.setForeground(Color.BLACK);
        b14.setMargin(new Insets(0,0,0,155));
        b14.setBounds(0,520,300,50);
        b14.addActionListener(this);
        p2.add(b14);
        
        
        b15 = new JButton("About");
        b15.setBackground(new Color(0, 128, 111));
        b15.setFont(new Font("Tahoma",Font.PLAIN,20));
        b15.setForeground(Color.BLACK);
        b15.setMargin(new Insets(0,0,0,175));
        b15.setBounds(0,560,300,50);
        b15.addActionListener(this);
        p2.add(b15);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1900,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1950,1000);
        add(l1);
        
        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(350,100,1000,60);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma",Font.PLAIN,55));
        l1.add(l4);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){}
            
        }
        else if(ae.getSource() == b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){}
            
            
        }else if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new UpdateCustomer(username).setVisible(true);
        }else if(ae.getSource()==b3){
            new ViewCustomer(username).setVisible(true);
        }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
            new ViewPackage(username).setVisible(true);
        }else if(ae.getSource()==b11){
            new Destinations().setVisible(true);
        }else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
        }else if(ae.getSource()==b9){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource()==b12){
            new Payment().setVisible(true);
        }else if(ae.getSource()==b15){
            new About().setVisible(true);
        }else if(ae.getSource()==b4){
            new DeleteCustomer(username).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Dashboard("").setVisible(true);
        
        
    }
    
}
