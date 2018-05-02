package eg.edu.alexu.csd.datastructure.maze.cs21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import eg.edu.alexu.csd.datastructure.stack.cs21.Stack;
import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;
import eg.edu.alexu.csd.datastructure.queue.cs21.Qlinkedlist;

public class MazeSolver2 implements IMazeSolver {
static int rows;
static int columns;
static char [][] Maze;
//x-coordinate for the start
int istart;
//y-coordinate for the start
int jstart;
//x-coordinate for the end
int iend;
//y-coordinate for the end
int jend;
private static class Point {
    int x;
    int y;
    Point parent;

    public Point(int x, int y, Point parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    public Point getParent() {
        return this.parent;
    }

    public String toString() {
        return "x = " + x + " y = " + y;
    }
}
static Qlinkedlist q=new Qlinkedlist();
static Stack s=new Stack();


public static Point getPathBFS(int x, int y) {
    q.enqueue(new Point(x,y, null));
    boolean pathF = false;
    while(!q.isEmpty()&& !pathF) {
    	
        Point p = (Point) q.dequeue();

        if (Maze[p.x][p.y] == 'E') {  
        	pathF = true;
            return p;
        }

        if(isFree(p.x+1,p.y)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x+1,p.y, p);
            q.enqueue(nextP);
        }

        if(isFree(p.x-1,p.y)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x-1,p.y, p);
            q.enqueue(nextP);
        }

        if(isFree(p.x,p.y+1)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x,p.y+1, p);
            q.enqueue(nextP);
        }

         if(isFree(p.x,p.y-1)) {
        	 Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x,p.y-1, p);
            q.enqueue(nextP);
        }

    }
    if (!pathF) {
		return null;
	}
    return null;
}
public static Point getPathDFS(int x, int y) {

    s.push(new Point(x,y, null));

    while(!s.isEmpty()) {
        Point p = (Point) s.pop();

        if (Maze[p.x][p.y] == 'E') {               
            return p;
        }

        if(isFree(p.x-1,p.y)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x-1,p.y, p);
            s.push(nextP);
        }

        if(isFree(p.x+1,p.y)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x+1,p.y, p);
            s.push(nextP);
        }

        if(isFree(p.x,p.y-1)) {
        	Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x,p.y-1, p);
            s.push(nextP);
        }

         if(isFree(p.x,p.y+1)) {
        	 Maze[p.x][p.y] = 'f';
            Point nextP = new Point(p.x,p.y+1, p);
            s.push(nextP);
        }

    }
    return null;
}
public static boolean isFree(int x, int y) {
    if((x >= 0 && x < Maze.length) && (y >= 0 && y < Maze[x].length) && (Maze[x][y] == '.' || Maze[x][y] == 'E')) {
        return true;
    }
    return false;
}
	@Override
	public int[][] solveBFS(File maze) {
		try{
			if(!maze.exists()) { 
				throw new RuntimeException("file not found");
			}
			BufferedReader br = new BufferedReader(new FileReader(maze));
			//this for the first line only to get rows and columns
			int flag=0;
			//this to check the existance of 'S'
			int flag1=0;
			//this to check the existance of 'E'
			int flag2=0;
			int RowsCounter=1;
			int i=-1;
			String line;
			while((line = br.readLine()) != null){
				if (flag == 0) {
					String[] first = line.split(" ");
					rows = Integer.parseInt(first[0]);
					columns =  Integer.parseInt(first[1]);
					Maze = new char[rows][columns];
				} else {
					
					for(int j=0;j<line.length();j++){
						Maze[i][j]=line.charAt(j);
						if(Maze[i][j] !='S' && Maze[i][j] !='E' && Maze[i][j] !='.' && Maze[i][j] !='#') {
							throw new RuntimeException("Wrong character");
						}
						if(Maze[i][j] =='S') {
							istart=i;
							jstart=j;
							flag1=1;
						}
						if(Maze[i][j] =='E') {
							iend=i;
							jend=j;
							flag2=1;
						}
						if(columns != line.length()) {
							throw new RuntimeException("Wrong dimension");
						}
					}
				}
				i++;
				RowsCounter++;
				flag=1;
			}
			if (rows != RowsCounter-2){
				throw new RuntimeException("Wrong dimension");
			}
			if(flag1 != 1 || flag2 != 1){
				throw new RuntimeException("S or E not found");
			}	
		} catch (FileNotFoundException e){
            System.err.println("FileNotFound: " + e.getMessage()); 
        } catch (IOException e) {
			  System.err.println("IOException: " + e.getMessage()); 
		}
		int [][]a=new int[50][2];
		 Point p = getPathBFS(istart,jstart);
		 if(p==null){
			 return null;
		 }
	        int i=0,count=0;
	        while(p.getParent() != null) {
	            a[i][0]=p.x;
	            a[i][1]=p.y;
	            i++;
	            count++;
	            p = p.getParent();
	        }
	        a[count][0]=istart;
	        a[count][1]=jstart;
	        int rows = count+1;
			int cols = 2;
			int[][] reverse = new int[rows][cols];
			for (int t = rows - 1; t >= 0; t--) {
				for (int j = cols - 1; j >= 0; j--) {
					reverse[rows - 1 - t][j] = a[t][j];
				}
			}
	     /*   for(int k=0;k<=count;k++){
	        	System.out.println(reverse[k][0]+" "+reverse[k][1]);
	        	System.out.println();
	        }*/

		return reverse;
	}

	@Override
	public int[][] solveDFS(File maze) {
		try{
			if(!maze.exists()) { 
				throw new RuntimeException("file not found");
			}
			BufferedReader br = new BufferedReader(new FileReader(maze));
			//this for the first line only to get rows and columns
			int flag=0;
			//this to check the existance of 'S'
			int flag1=0;
			//this to check the existance of 'E'
			int flag2=0;
			int RowsCounter=1;
			int i=-1;
			String line;
			while((line = br.readLine()) != null){
				if (flag == 0) {
					String[] first = line.split(" ");
					rows = Integer.parseInt(first[0]);
					columns =  Integer.parseInt(first[1]);
					Maze = new char[rows][columns];
				} else {
					
					for(int j=0;j<line.length();j++){
						Maze[i][j]=line.charAt(j);
						if(Maze[i][j] !='S' && Maze[i][j] !='E' && Maze[i][j] !='.' && Maze[i][j] !='#') {
							throw new RuntimeException("Wrong character");
						}
						if(Maze[i][j] =='S') {
							istart=i;
							jstart=j;
							flag1=1;
						}
						if(Maze[i][j] =='E') {
							iend=i;
							jend=j;
							flag2=1;
						}
						if(columns != line.length()) {
							throw new RuntimeException("Wrong dimension");
						}
					}
				}
				i++;
				RowsCounter++;
				flag=1;
			}
			if (rows != RowsCounter-2){
				throw new RuntimeException("Wrong dimension");
			}
			if(flag1 != 1 || flag2 != 1){
				throw new RuntimeException("S or E not found");
			}	
		} catch (FileNotFoundException e){
            System.err.println("FileNotFound: " + e.getMessage()); 
        } catch (IOException e) {
			  System.err.println("IOException: " + e.getMessage()); 
		}
		Point p = getPathDFS(istart,jstart);
		if(p==null){
			 return null;
		 }
		 int [][]a=new int[50][2];
	        int i=0,count=0;
	        while(p.getParent() != null) {
	            a[i][0]=p.x;
	            a[i][1]=p.y;
	            i++;
	            count++;
	            p = p.getParent();
	        }
	        a[count][0]=istart;
	        a[count][1]=jstart;
	        int rows = count+1;
			int cols = 2;
			int[][] reverse = new int[rows][cols];
			for (int t = rows - 1; t >= 0; t--) {
				for (int j = cols - 1; j >= 0; j--) {
					reverse[rows - 1 - t][j] = a[t][j];
				}
			}
	     /*   for(int k=0;k<=count;k++){
	        	System.out.println(reverse[k][0]+" "+reverse[k][1]);
	        	System.out.println();
	        }*/

		return reverse;
	}

}