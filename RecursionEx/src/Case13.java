import java.util.Scanner;

// #13
// 미로 찾기
public class Case13 {
	
	private static int N = 8;
	private static int[][] maze={
		{0,0,0,0,0,0,0,1},
		{0,1,1,0,1,1,0,1},
		{0,0,0,1,0,0,0,1},
		{0,1,1,0,0,1,1,0},
		{0,1,1,1,0,0,0,1},
		{0,1,0,0,0,1,0,1},
		{0,0,0,1,0,0,0,1},
		{0,1,1,1,0,1,0,0}
	};
	
	private static int PATHWAY_COLOUR = 0;
	private static int WALL_COLOUR = 1;
	private static int BLOCKED_COLOUR = 2;
	private static int PATH_COLOUR = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMazePath(0, 0);
	}

	public static boolean findMazePath(int x, int y){
		if(x<N || y<N || x>0 || y>0)
			return false;
		else if(maze[x][y] != PATHWAY_COLOUR)
			return false;
		else if(x == N-1 && y ==N-1){
			maze[x][y] = PATH_COLOUR;
			return true;
		}else{
			maze[x][y] = PATH_COLOUR;
			if(findMazePath(x-1, y) || findMazePath(x+1, y)||
					findMazePath(x, y-1) || findMazePath(x, y+1)){
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR;
			System.out.println("길이 있습니다.");
			return false;
		}
	}
}