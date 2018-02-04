/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
    
public class calculator extends MouseAdapter {
    JFrame f1;
    JPanel pp1;
    JLabel p1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    JTextField t1;
    ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19;
    calculator()
    {
        f1=new JFrame();
        pp1=new JPanel();
       // ImageIcon i1=new ImageIcon("C:\\Users\\Administrator\\Pictures\\calc1");
        p1=new JLabel(new ImageIcon("C:\\Users\\Administrator\\Pictures\\calc3.jpg"));
       // p1.setLayout(new FlowLayout());
        f1.add(p1);
        t1=new JTextField();
        p1.add(t1);
        p1.setLayout(null);
        t1.setBounds(265,20,200,40);
        
        i1=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b7.png");
        b1=new JButton("");
        b1.setIcon(i1);
        p1.add(b1); 
        b1.setBounds(150, 100,41, 40);
        i2=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b8.png");
        b2=new JButton("");
        b2.setIcon(i2);
        p1.add(b2); 
        b2.setBounds(250, 100,41, 40);
        i3=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b9.png");
        b3=new JButton("");
        b3.setIcon(i3);
        p1.add(b3); 
        b3.setBounds(345, 100,41, 40);
        i4=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b12.png");
        b4=new JButton("");
        b4.setIcon(i4);
        p1.add(b4); 
        b4.setBounds(450, 100,41, 40);
        i5=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b15.png");
        b5=new JButton("");
        b5.setIcon(i5);
        p1.add(b5); 
        b5.setBounds(550, 100,41, 40);
        i6=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b4.png");
        b6=new JButton("");
        b6.setIcon(i6);
        p1.add(b6); 
        b6.setBounds(150, 200,41, 40);
        i7=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b5.png");
        b7=new JButton("");
        b7.setIcon(i7);
        p1.add(b7); 
        b7.setBounds(250, 200,41, 40);
        i8=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b6.png");
        b8=new JButton("");
        b8.setIcon(i8);
        p1.add(b8); 
        b8.setBounds(350, 200,41, 40);
        i9=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b13.png");
        b9=new JButton("");
        b9.setIcon(i9);
        p1.add(b9); 
        b9.setBounds(450, 200,41, 40);
        i10=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b11.png");
        b10=new JButton("");
        b10.setIcon(i10);
        p1.add(b10); 
        b10.setBounds(550, 200,41, 40);
        i11=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b1.png");
        b11=new JButton("");
        b11.setIcon(i11);
        p1.add(b11); 
        b11.setBounds(150, 300,41, 40);
        i12=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b2.png");
        b12=new JButton("");
        b12.setIcon(i12);
        p1.add(b12); 
        b12.setBounds(250, 300,41, 40);
        i13=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b3.png");
        b13=new JButton("");
        b13.setIcon(i13);
        p1.add(b13); 
        b13.setBounds(350, 300,41, 40);
        i14=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b-.png");
        b14=new JButton("");
        b14.setIcon(i14);
        p1.add(b14); 
        b14.setBounds(550, 300,41, 40);
        i15=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b0.png");
        b15=new JButton("");
        b15.setIcon(i15);
        p1.add(b15); 
        b15.setBounds(150, 400,41, 40);
        i16=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b17.png");
        b16=new JButton("");
        b16.setIcon(i16);
        p1.add(b16); 
        b16.setBounds(250, 400,41, 40);
        i17=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b16.png");
        b17=new JButton("");
        b17.setIcon(i17);
        p1.add(b17); 
        b17.setBounds(350, 400,41, 40);
        i18=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b+.png");
        b18=new JButton("");
        b18.setIcon(i18);
        p1.add(b18); 
        b18.setBounds(450, 300,41, 140);
        i19=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b14.png");
        b19=new JButton("");
        b19.setIcon(i19);
        p1.add(b19); 
        b19.setBounds(550, 400,41, 40);
        p1.setBackground(Color.YELLOW);
     //    b1.setBackground(Color.YELLOW);
        b1.setBorder(null);
       //  b2.setBackground(Color.YELLOW);
        b2.setBorder(null);
      //   b3.setBackground(Color.YELLOW);
        b3.setBorder(null);
        // b4.setBackground(Color.YELLOW);
        b4.setBorder(null);
         //b5.setBackground(Color.YELLOW);
        b5.setBorder(null);
       //  b6.setBackground(Color.YELLOW);
        b6.setBorder(null);
        // b7.setBackground(Color.YELLOW);
        b7.setBorder(null);
        // b8.setBackground(Color.YELLOW);
        b8.setBorder(null);
        // b9.setBackground(Color.YELLOW);
        b9.setBorder(null);
        // b10.setBackground(Color.YELLOW);
        b10.setBorder(null);
        // b11.setBackground(Color.YELLOW);
        b11.setBorder(null);
        // b12.setBackground(Color.YELLOW);
        b12.setBorder(null);
        // b13.setBackground(Color.YELLOW);
        b13.setBorder(null);
        // b14.setBackground(Color.YELLOW);
        b14.setBorder(null);
        // b15.setBackground(Color.YELLOW);
        b15.setBorder(null);
        // b16.setBackground(Color.YELLOW);
        b16.setBorder(null);
        // b17.setBackground(Color.YELLOW);
        b17.setBorder(null);
        // b18.setBackground(Color.YELLOW);
        b18.setBorder(null);
        // b19.setBackground(Color.YELLOW);
        b19.setBorder(null);
        //t1.setBorder(0b1010);
        Font font = new Font("SansSerif", Font.BOLD,25);
        t1.setFont(font);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setBackground(Color.CYAN);
        f1.setVisible(true);
        f1.setSize(700,500);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);
        b6.addMouseListener(this);
        b7.addMouseListener(this);
        b8.addMouseListener(this);
        b9.addMouseListener(this);
        b10.addMouseListener(this);
        b11.addMouseListener(this);
        b12.addMouseListener(this);
        b13.addMouseListener(this);
        b14.addMouseListener(this);
        b15.addMouseListener(this);
        b16.addMouseListener(this);
        b17.addMouseListener(this);
        b18.addMouseListener(this);
        b19.addMouseListener(this);
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        if(e.getSource().equals(b1))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb7.png");
            b1.setIcon(i20);
        }
        if(e.getSource().equals(b2))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb8.png");
            b2.setIcon(i20);
        }
         if(e.getSource().equals(b3))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\z9.png");
            b3.setIcon(i20);
        }
        if(e.getSource().equals(b4))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb12.png");
            b4.setIcon(i20);
        }
        if(e.getSource().equals(b5))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb15.png");
            b5.setIcon(i20);
        }
        if(e.getSource().equals(b6))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb4.png");
            b6.setIcon(i20);
        }
        if(e.getSource().equals(b7))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb5.png");
            b7.setIcon(i20);
        }
        if(e.getSource().equals(b8))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb6.png");
            b8.setIcon(i20);
        }
        if(e.getSource().equals(b9))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb13.png");
            b9.setIcon(i20);
        }
        if(e.getSource().equals(b10))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb11.png");
            b10.setIcon(i20);
        }
        if(e.getSource().equals(b11))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb1.png");
            b11.setIcon(i20);
        }
        if(e.getSource().equals(b12))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb2.png");
            b12.setIcon(i20);
        }
        if(e.getSource().equals(b13))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb3.png");
            b13.setIcon(i20);
        }
        if(e.getSource().equals(b14))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb-.png");
            b14.setIcon(i20);
        }
        if(e.getSource().equals(b15))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb0.png");
            b15.setIcon(i20);
        }
        if(e.getSource().equals(b16))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb17.png");
            b16.setIcon(i20);
        }
        if(e.getSource().equals(b17))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb16.png");
            b17.setIcon(i20);
        }
        if(e.getSource().equals(b18))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb+.png");
            b18.setIcon(i20);
        }
        if(e.getSource().equals(b19))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb14.png");
            b19.setIcon(i20);
        }
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        if(e.getSource().equals(b1))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b7.png");
            b1.setIcon(i20);
        }
        if(e.getSource().equals(b2))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b8.png");
            b2.setIcon(i20);
        }
        if(e.getSource().equals(b3))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b9.png");
            b3.setIcon(i20);
        }
        if(e.getSource().equals(b4))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b12.png");
            b4.setIcon(i20);
        }
        if(e.getSource().equals(b5))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b15.png");
            b5.setIcon(i20);
        }
        if(e.getSource().equals(b6))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b4.png");
            b6.setIcon(i20);
        }
        if(e.getSource().equals(b7))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b5.png");
            b7.setIcon(i20);
        }
        if(e.getSource().equals(b8))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b6.png");
            b8.setIcon(i20);
        }
        if(e.getSource().equals(b9))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b13.png");
            b9.setIcon(i20);
        }
        if(e.getSource().equals(b10))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b11.png");
            b10.setIcon(i20);
        }
        if(e.getSource().equals(b11))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\bb1.png");
            b11.setIcon(i20);
        }
        if(e.getSource().equals(b12))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b2.png");
            b12.setIcon(i20);
        }
        if(e.getSource().equals(b13))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b3.png");
            b13.setIcon(i20);
        }
        if(e.getSource().equals(b14))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b-.png");
            b14.setIcon(i20);
        }
        if(e.getSource().equals(b15))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b0.png");
            b15.setIcon(i20);
        }
        if(e.getSource().equals(b16))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b17.png");
            b16.setIcon(i20);
        }
        if(e.getSource().equals(b17))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b16.png");
            b17.setIcon(i20);
        }
        if(e.getSource().equals(b18))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b+.png");
            b18.setIcon(i20);
        }
        if(e.getSource().equals(b19))
        {
            ImageIcon i20=new ImageIcon("C:\\Program Files (x86)\\NetBeans 7.1.1\\bin\\images\\b14.png");
            b19.setIcon(i20);
        }
        
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        if(e.getSource().equals(b1))
        {
            t1.setText(t1.getText()+"7");
        }
        if(e.getSource().equals(b2))
            t1.setText(t1.getText()+"8");
        if(e.getSource().equals(b3))
            t1.setText(t1.getText()+"9");
        if(e.getSource().equals(b4))
            t1.setText(t1.getText()+"/");
        if(e.getSource().equals(b5))
        {
          StringBuffer sb = new StringBuffer(t1.getText());
        sb = sb.deleteCharAt(t1.getText().length()-1);
        t1.setText(sb.toString());
        }
        if(e.getSource().equals(b6))
            t1.setText(t1.getText()+"4");
        if(e.getSource().equals(b7))
            t1.setText(t1.getText()+"5");
        if(e.getSource().equals(b8))
            t1.setText(t1.getText()+"6");
        if(e.getSource().equals(b9))
            t1.setText(t1.getText()+"%");
        if(e.getSource().equals(b10))
            t1.setText(t1.getText()+"*");
        if(e.getSource().equals(b11))
            t1.setText(t1.getText()+"1");
        if(e.getSource().equals(b12))
            t1.setText(t1.getText()+"2");
        if(e.getSource().equals(b13))
            t1.setText(t1.getText()+"3");
        if(e.getSource().equals(b14))
            t1.setText(t1.getText()+"-");
        if(e.getSource().equals(b15))
            t1.setText(t1.getText()+"0");
        if(e.getSource().equals(b16))
            t1.setText(t1.getText()+".");
        if(e.getSource().equals(b17))
        {
            String s1=t1.getText();
            int i=0,flag=0;
            
            
            char[] a = s1.toCharArray();
            int n=a.length-1;
            if(a[i]=='+'||a[i]=='-'||a[i]=='/'||a[i]=='*'||a[i]=='%'||a[n]=='+'||a[n]=='-'||a[n]=='/'||a[n]=='*'||a[n]=='%')
                flag=1;                     
            else
            {
            for(i=1;i<a.length;i++)
            {
                if(a[i]=='+'||a[i]=='-'||a[i]=='/'||a[i]=='*'||a[i]=='%')
                {
                    if((a[i-1]-'0')>=0&&(a[i+1]-'0')>=0)
                    flag=0;
                
                else
                {
                    flag=1;
                    break;
                
                }
                }
            }
            }
            if(flag==0)
            {
               int k,top=-1;
       char st[]=new char[100];
       int st1[]=new int[100];
       int top1=-1;
        for(i=s1.length()-1;i>=0;i--)
        {
            if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
                st1[++top1]=s1.charAt(i)-'0';
            else
                st[++top]=s1.charAt(i);
        }
        while(top1>-1&&top>-1)
        {
            int x=st1[top1--];
            char y=st[top--];
            int z=st1[top1--];
            if(y=='+')
                st1[++top1]= (x+z);
            if(y=='-')
                st1[++top1]= x-z;
            if(y=='*')
                st1[++top1]= (x*z);
            if(y=='/')
                st1[++top1]=(x/z);
            if(y=='%')
                st1[++top1]=x%z;
        }
   
                t1.setText(st1[top1]+"");
                
            }
              else
                  t1.setText("not valid");
        }
        
        if(e.getSource().equals(b18))
            t1.setText(t1.getText()+"+");
        if(e.getSource().equals(b19))
            t1.setText("");

  
    }

 
    public static void main(String []args)
    {
        calculator m=new calculator();
    }
};

