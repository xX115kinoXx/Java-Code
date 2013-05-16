package RpgAdventure;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Magic extends JFrame
{
   private JButton Magic;
   private JButton Ice;
   private JButton Thunder;
   private JButton Wind;
   
   public Magic()
   {
     super("Magic Attacks");
	   setLayout(new FlowLayout());
	  
	   Icon a = new ImageIcon(getClass().getResource("GuiCustom.png"));
	   Magic = new JButton("Fire", a);
	   add(Magic);
	   
	   Icon b = new ImageIcon(getClass().getResource("GuiCustom.png"));
	   Ice = new JButton("Ice", b);
	   add(Ice);
	   
	   Icon c = new ImageIcon(getClass().getResource("GuiCustom.png"));
	   Thunder = new JButton("Thunder", c);
	   add(Thunder);
	   
	   Icon d = new ImageIcon(getClass().getResource("GuiCustom.png"));
	   Wind = new JButton("Wind", d);
	   add(Wind);
	   
	   HandlerClass handler = new HandlerClass();
	   Magic.addActionListener(handler);
	   Ice.addActionListener(handler);
	   Thunder.addActionListener(handler);
	   Wind.addActionListener(handler);
	     
   }
   private class HandlerClass implements ActionListener
   {

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		JOptionPane.showMessageDialog(null, String.format("%s", "The Magic Spell Has Been Used"));
		

	}
	   
	   
	   
	   
	   
   }
   
   
	
	
}
