/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class test extends JFrame {

    public test() throws HeadlessException {
        final JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.red));
        panel.setPreferredSize(new Dimension(800, 600));

        final JScrollPane scroll = new JScrollPane(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(scroll, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(final String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new test().setVisible(true);
            }
        });
    }
}
