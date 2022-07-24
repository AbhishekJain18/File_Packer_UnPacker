import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;

class MarvellousMain {
	public static void main(String arg[])
	{
		try
		{
			MarvellousLogin frame = new MarvellousLogin();
			frame.setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showInternalMessageDialog(null, e.getMessage());
			
		}
		
	}

}

