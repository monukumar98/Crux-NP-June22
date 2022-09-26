package Lec23;

public class Rat_in_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'O', 'X', 'O', 'O' }, { 'O', 'O', 'O', 'X' }, { 'X', 'O', 'X', 'O' },
				{ 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'O' } };
		int[][] ans = new int[maze.length][maze[0].length];
		FindPath(maze, 0, 0, ans);

	}

	public static void FindPath(char[][] maze, int cr, int cc, int ans[][]) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1;
			Display(ans);
			System.out.println();
			return;
		}

		if (cr < 0 || cc < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		for (int i = 0; i < c.length; i++) {
			FindPath(maze, cr + r[i], cc + c[i], ans);

		}
//		FindPath(maze, cr - 1, cc, ans);
//		FindPath(maze, cr + 1, cc, ans);
//		FindPath(maze, cr, cc - 1, ans);
//		FindPath(maze, cr, cc + 1, ans);

		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
