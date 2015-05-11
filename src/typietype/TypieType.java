/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typietype;

import javax.swing.JFrame;

/**
 *
 * @author Klingberg
 */
public class TypieType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TTStartFrame startFrame = new TTStartFrame();
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        startFrame.setVisible(true);
        
    }
    
}
