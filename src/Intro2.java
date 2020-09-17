import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;

public class Intro2 {

 
    public static void main(String[] args) {
        SketchPadWindow spw = new SketchPadWindow(600,400);
        Pen p = new StandardPen(spw);
        p.move(20);
        p.turn(90);
        p.move(30);
        p.move(0,0);
        
        Pen p2 = new WigglePen(spw);
        p2.setWidth(10);
        p2.setColor(Color.red);
        p2.up();//tkaes pen off page
        p2.move(100,-50);
        p2.down();
        p2.setDirection(0);//east (right)
        p2.move(100);
        p2.turn(-90);//right turn
        p2.move(100);
        
        //turn "p" into another object
        p = new RainbowPen(spw);
        p.setDirection(270);
        p.setWidth(20);
        p.move(100);
        p.turn(90);
        p.move(200);
        
        
        
       
    }
    
}
