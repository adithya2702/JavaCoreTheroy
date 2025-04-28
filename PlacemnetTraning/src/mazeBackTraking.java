import java.util.Scanner;
public class mazeBackTraking {
    static boolean isSafe(int [][] maze, int r, int c) {
        if(r>=0 && r<maze.length && c>=0 && c<maze.length) {
            return true;
        }
        else {
            return false;
        }
    }
    static boolean findPath(int maze[][], int x, int y){
        if(x==maze.length-1 && y==maze[0].length-1){
          //  sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze,x,y)){

        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    }
}
