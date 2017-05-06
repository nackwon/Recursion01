import java.util.Scanner;

// counting cells in a Blob

public class Case14 {
	
	private static int BLACKGROUND_COLOUR = 0;
	private static int IMAGE_COLOUR = 1;
	private static int ALREADY_COUNTED = 2;
	
	static int[][] grid = {
		{1,0,0,0,0,0,0,1},
		{0,1,1,0,0,1,0,0},
		{1,1,0,0,1,0,1,0},
		{0,0,0,0,0,1,0,0},
		{0,1,0,1,0,1,0,0},
		{0,1,0,1,0,1,0,0},
		{1,0,0,0,1,0,0,1},
		{0,1,1,0,0,1,1,1}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		countCells(x,y);
	}
	
	public static int countCells(int x, int y){
		
		int result;
		
		if(x<0 || x>=8 || y<0 || y>=8)
			return 0;
		else if(grid[x][y] != IMAGE_COLOUR)
			return 0;
		else{
			grid[x][y] = ALREADY_COUNTED;
			return 1+countCells(x-1, y+1)+countCells(x, y+1)+
					countCells(x+1, y+1)+countCells(x-1, y)+
					countCells(x+1, y)+countCells(x-1, y-1)+
					countCells(x, y-1)+countCells(x+1, y-1);
		}
	}

}
