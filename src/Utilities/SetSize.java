/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class SetSize {
    public ImageIcon setSizeAnh(URL url, int width, int height){
        ImageIcon imgi = new ImageIcon(url);
        Image img = imgi.getImage();
        Image resize = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resize);
    }
}
