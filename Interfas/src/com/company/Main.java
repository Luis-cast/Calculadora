package com.company;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Main implements ActionListener {

JButton b1,b2,b3,b4,b5;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JFrame f1 = new JFrame("Calculator Java By L");
  
public Main(){
 f1.setLayout(new FlowLayout());
 Dimension d = new Dimension();
     //botones
    b1 = new JButton("+");
    b2 = new JButton("-");
    b3 = new JButton("*");
    b4 = new JButton("/");
    b5 = new JButton("=");
    //labels
     l1 = new JLabel("Valor 1");
     l2 = new JLabel("Valor 2");
     l3 = new JLabel("Resultado");

    t1 = new JTextField(6);
     t2 = new JTextField(6);
     t3 = new JTextField(6);
     //agrega al form
      f1.add(l1);f1.add(t1); f1.add(l2); f1.add(t2);
      f1.add(b1);  f1.add(b2);     f1.add(b3);     f1.add(b4);
      f1.add(l3);  f1.add(t3);
     b1.setMargin(new Insets(1, 5, 1, 5));
     b2.setMargin(new Insets(1, 5, 1, 5));
     b3.setMargin(new Insets(1, 5, 1, 5));
     b4.setMargin(new Insets(1, 5, 1, 5));

    //escuchar
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      //opciones frame
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setResizable(false);
      f1.setLocation((int) ((d.getWidth()/2)+290), 50);
      f1.setSize(400, 250);
      f1.setVisible(true);
}

    public static void main(String[] args) {
   Main inicia = new Main();
	
    }
      @Override
         public void actionPerformed(ActionEvent event) {
                 Float n1, n2, r;
                 n1 = Float.parseFloat(t1.getText());
                 n2 = Float.parseFloat(t2.getText());

                if (event.getSource()==b1)
                 {
                     r = n1 + n2;
                     t3.setText(""+r);   }
                else if (event.getSource()==b2)
                 {
                     r = n1 - n2;
                     t3.setText(""+r);   }
                else if (event.getSource()==b3)
                 {
                     r = n1 * n2;
                     t3.setText(""+r);   }
                else
                 {
                     r = n1 / n2;
                     t3.setText(""+r);   }
             }

}
