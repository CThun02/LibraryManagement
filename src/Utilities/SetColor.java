/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class SetColor {
    public void changeColorBtn(String chucnang, JLabel ...args){
        for (JLabel _lstCN1 : args) {
            if (_lstCN1.getText().equalsIgnoreCase(chucnang)) {
                _lstCN1.getParent().setBackground(new Color(125,220,125));
                continue;
            }
            _lstCN1.getParent().setBackground(new Color(125,190,125));
        }
    }
}
