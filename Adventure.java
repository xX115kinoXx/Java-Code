package RpgAdventure;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Adventure extends JFrame implements Runnable
{
  private JButton Attack;
	int x, y, xDirection, yDirection;
	private Image dbImage;
	private Graphics dbg;
	Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 30);

	public void run()
	{
		try
		{
			while(true)
			{
				move();
				Thread.sleep(5);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Adventure KeyHandler Error");
		}
		
	}

		public void move()
		{
			x += xDirection;
			y += yDirection;
			if(x <= 3)
		         x = 3;
		    if(x >= 582)
		         x = 582;
		    if(y <= 24)
		         y = 24;
		    if(y >= 481)
		         y = 481;
		}
		public void setXDirection(int xdir)
		{
			xDirection = xdir;
		}
		public void setYDirection(int ydir)
		{
			yDirection = ydir;
		}
	public class AL extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			if(keyCode == e.VK_A)
		    {
               setXDirection(-1);
			}
			if(keyCode == e.VK_D)
		    {
              setXDirection(+1);
			}
			if(keyCode == e.VK_W)
		    {
              setYDirection(-1);
			}
			if(keyCode == e.VK_S)
		    {
             setYDirection(+1);
			}		
		}

		
		public void keyReleased(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			if(keyCode == e.VK_A)
		    {
              setXDirection(0);
			}
			if(keyCode == e.VK_D)
		    {
              setXDirection(0);
			}
			if(keyCode == e.VK_W)
		    {
              setYDirection(0);
			}
			if(keyCode == e.VK_S)
		    {
              setYDirection(0);
			}		
		}
	}
	public Adventure()
	{
		addKeyListener(new AL());
		setTitle("115kino: Adventure");
		setSize(600, 500);
		setResizable(false);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 150;
		y = 150;
	}
	public void paint(Graphics g)
	{
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
		
	}
	public void paintComponent(Graphics g)
	{
		g.setFont(font);
		g.setColor(Color.RED);
		g.fillOval(x, y, 15, 15);
	    g.drawString("Adeventure Part 1: Where it all Began", 4, 50);
		repaint();		
	}
	public static void main(String[] args)
	{
		String fn = JOptionPane.showInputDialog("First Number");
		String sn = JOptionPane.showInputDialog("Second Number");
		String tn = JOptionPane.showInputDialog("Third Number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int num3 = Integer.parseInt(tn);
		int sum = num1 + num2 + num3;
		
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300, 100);
		go.setVisible(true);
		go.setResizable(false);
		
		Magic M = new Magic();
		M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		M.setSize(300, 100);
		M.setVisible(true);
		M.setResizable(false);
		

		
		JOptionPane.showMessageDialog(null, "The Answer Is " +sum,"Solution", JOptionPane.PLAIN_MESSAGE);
		
		Adventure jg = new Adventure();
		Thread t1 = new Thread(jg);
		t1.start();
		{
		
	}

}
}
