
import javax.swing.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sumakmur Goenawan
 */

public abstract class prak3 implements ActionListener {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("i am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        JButton butt=new JButton("click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20,20,200,20);
        prak3 app = new prak3(){};
        app.label = new JLabel("nama tidak terdeteksi");
        app.label.setBounds(20,40,200,20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e )
    {
        label.setText("nama saya sumakmur");
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    JLabel label;
}
