


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHADOW
 */
public class Gpanl extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D d= (Graphics2D) g;
        int h=getHeight(),w=getWidth();
        Color c2=new Color(60, 110, 75),c1=new Color(145, 21, 115);
        GradientPaint gq=new GradientPaint(0,0,c1,180,h,c2);
        d.setPaint(gq);
        d.fillRect(0, 0, w, h);
    }
}
