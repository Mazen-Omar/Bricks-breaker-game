package prj;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
	
	public int map[][];
	public int BrickWidth;
	public int BrickHeight;
	
	//Constructor 
	public MapGenerator(int row , int col) {
		map=new int[row][col];
		for(int i = 0; i < map.length; i++) 
		{
			for(int j = 0; j < map[0].length; j++) 
			{
				map[i][j]=1;				
				// 1 will detect this particular brick have not intersected with the ball
				// If you do not want to draw any particular brick put the value of the array elements equals zero
			}	
		}	
		BrickWidth=540/col;
		BrickHeight=150/row; 		//recomended values for the the dimensions of the brick
	}
	public void setBrick(int value,int r,int c) {
		map[r][c]=value;
	}
	
	//big slip will be drawn when this function called where there is an array value of 1 
	public void draw(Graphics2D g) {
		for(int i = 0 ; i < map.length; i++) 
		{
			for(int j = 0 ; j < map[0].length; j++) 
			{
				if(map[i][j] > 0) {
					g.setColor(Color.white);
					g.fillRect(j * BrickWidth + 75 , i * BrickHeight + 50 , BrickWidth, BrickHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					//g.drawRect(x, y, width, height);
					g.drawRect(j * BrickWidth + 75, i * BrickHeight + 50, BrickWidth, BrickHeight);
					
				}
				
			}
			
		}
	}
	              public void setBrickValue(int value, int row,int col)
	              {
		              map[row][col]=value; 

                  }

}
