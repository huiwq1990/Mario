package run;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dk.itu.mario.engine.MarioComponent;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		JFrame frame = new JFrame("Mario Experience Showcase");
    	MarioComponent mario = new MarioComponent(640, 480,false);

    	frame.setContentPane(mario);
    	frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);

        frame.setVisible(true);

        mario.start();
        */
        
        

    	JFrame frame = new JFrame("Mario Experience Showcase");
    	MarioComponent mario = new MarioComponent(640, 480,true);

    	frame.setContentPane(mario);
    	frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);

        frame.setVisible(true);

        mario.start();   
	}

}
