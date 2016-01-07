package FP;
/*
 * this class is Floor plan object
 */
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.*;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class FP extends Applet{
	private BufferedImage FloorPlanImage = null;
	private Image I1 = null;
	
	private int width;
	private int height;
	
	
	/*
	 * default constructor
	 */
	public FP(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;	
		
	}
	
	
	
	
	public Image loadImage(String path)
	{	
		Image temp = null;
		try
		{
			URL iURL = FP.class.getResource(path);
			temp = Toolkit.getDefaultToolkit().createImage(iURL);
		}
		catch (Exception e)
		{
			System.out.println("Loading Failed");
		}
		this.I1 = temp;
		return temp;
	}
	
	public void getProperty()
	{
		ImageObserver tempIO = null;
		this.height = this.I1.getHeight(tempIO);
		this.width = this.I1.getWidth(tempIO);
		
	}
	
}
