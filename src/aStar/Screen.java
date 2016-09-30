package aStar;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;

public class Screen extends JPanel{
	public Screen ()
	{
		
	}
	public void paint(Graphics g)
	{
		Map hehe = new Map();

		Random random = new Random();
		int ran = random.nextInt(130);
		//System.out.println(ran);
		for (int i = 0;i<160;i++)
    	{
    		for (int j = 0;j<120;j++)
    		{
    			if (Map.cell[i][j].type == '1')
    			{
    				g.setColor(Color.lightGray);
    				g.drawRect(5*i, 5*j, 5, 5);
    			}
    			else if (Map.cell[i][j].type == '2')
    			{
    				g.setColor(Color.gray);
    				g.fillRect(5*i, 5*j, 5,5);
    			}
    			else if (Map.cell[i][j].type == 'a')
    			{
    				g.setColor(new Color(53,161,159));
    				g.fillRect(5*i, 5*j, 5,5);

    			}
    			else if (Map.cell[i][j].type == 'b')
    			{
    				g.setColor(new Color(53,80,159));
    				g.fillRect(5*i, 5*j, 5,5);
    				
    			}
    			else if (Map.cell[i][j].type == '0')
    			{
    				g.setColor(Color.black);
    				g.fillRect(5*i, 5*j, 5,5);
    				
    			}
    			
    		}
    	}
		
		
	}
}
