package Backtracking;
public class RatInMaze {

    // Ye function solution matrix print karega
    public static void printSolution(int sol[][]) {

        // Har row ko traverse karo
        for (int i = 0; i < sol.length; i++) {

            // Har column ko traverse karo
            for (int j = 0; j < sol.length; j++) {

                // Current cell print karo
                System.out.print(sol[i][j] + " ");
            }

            // Har row ke baad next line
            System.out.println();
        }
    }


    // Ye function check karega ki rat current cell (x,y) par ja sakta hai ya nahi
    public static boolean isSafe(int maze[][], int x, int y) {

        // x >= 0        -> row negative nahi honi chahiye
        // x < length    -> row maze ke bahar nahi honi chahiye
        // y >= 0        -> column negative nahi hona chahiye
        // y < length    -> column maze ke bahar nahi hona chahiye
        // maze[x][y]==1 -> cell open hona chahiye

        return (x >= 0 &&
                x < maze.length &&
                y >= 0 &&
                y < maze.length &&
                maze[x][y] == 1);
    }


    // Ye main solving function ko start karega
    public static boolean solveMaze(int maze[][]) {

        // Maze ka size nikal liya
        int N = maze.length;


        // Ek alag solution matrix banayi
        // Initially sab values 0 hongi
        int sol[][] = new int[N][N];


        // Rat ko starting position (0,0) se start kara rahe hain
        // Agar solveMazeUtil false return kare
        // matlab solution exist nahi karta
        if (solveMazeUtil(maze, 0, 0, sol) == false) {

            System.out.println("Solution doesn't exist");

            return false;
        }


        // Agar solution mil gaya toh solution matrix print karo
        printSolution(sol);

        return true;
    }


    // Ye actual backtracking function hai
    public static boolean solveMazeUtil(
            int maze[][],
            int x,
            int y,
            int sol[][]) {


        // STEP 1: DESTINATION CHECK

        // Agar rat last cell par pahunch gaya
        // aur destination cell open hai
        if (x == maze.length - 1 &&
            y == maze.length - 1 &&
            maze[x][y] == 1) {

            // Destination ko solution path me mark karo
            sol[x][y] = 1;

            // Solution mil gaya
            return true;
        }


        // STEP 2: CHECK CURRENT CELL SAFE HAI YA NAHI

        if (isSafe(maze, x, y) == true) {


            // Agar ye cell already solution path me hai
            // toh dobara visit mat karo
            if (sol[x][y] == 1) {

                return false;
            }


            // STEP 3: DO / CHOOSE

            // Current cell ko solution path me include karo
            sol[x][y] = 1;


            // STEP 4: EXPLORE DOWN

            // x + 1 ka matlab next row
            // yani DOWN move karna
            if (solveMazeUtil(maze, x + 1, y, sol)) {

                // Agar down jaake destination mil gaya
                return true;
            }


            // STEP 5: EXPLORE RIGHT

            // y + 1 ka matlab next column
            // yani RIGHT move karna
            if (solveMazeUtil(maze, x, y + 1, sol)) {

                // Agar right jaake destination mil gaya
                return true;
            }


            // STEP 6: UNDO / BACKTRACK

            // Down aur Right dono se solution nahi mila
            // toh current cell ko solution path se hata do
            sol[x][y] = 0;


            // Current path fail ho gaya
            return false;
        }


        // Agar current cell safe hi nahi tha
        return false;
    }


    public static void main(String args[]) {

        // 1 = open path
        // 0 = blocked path
        int maze[][] = {

            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };


        // Maze solve karo
        solveMaze(maze);
    }
}