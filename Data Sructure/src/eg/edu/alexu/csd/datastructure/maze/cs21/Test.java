package eg.edu.alexu.csd.datastructure.maze.cs21;

import java.io.File;

public class Test {
	private static  File maze = new File("c:\\test\\testmaze.txt"); 
    public static void main(String[] args) {
    	MazeSolver2 m=new MazeSolver2();
    	 int [][] a= m.solveDFS(maze);
    	    for(int k=0;k<=a[0].length+7;k++){
     	   System.out.println(a[k][0]+" "+a[k][1]);
     	   System.out.println();
     }

    }

}