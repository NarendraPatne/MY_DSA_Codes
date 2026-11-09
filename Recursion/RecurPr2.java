import java.util.*;

public class RecurPr2 {
     public static void printSubseq(String s,String ans,int i){
        if(i>=s.length())
        {
            System.out.println(ans);
            return;
        }
        // Not Choose
        printSubseq(s, ans, i+1);
        // choose
        ans+=s.charAt(i);
        printSubseq(s, ans, i+1);
       }

    public static void printASubseq(int arr[],List<Integer> list,int i)
    {
        if(i>arr.length-1)
        {
            System.out.println(list);
            return;
        }
        // skip
        printASubseq(arr, list, i+1);
        // pick
        list.add(arr[i]);
        printASubseq(arr, list, i+1);
        // Remove the element we just printed (Backtracking)
        list.remove(list.size()-1);
    }
    public static void stringPermutations(String ansStr,String mainStr)
    {
        // Base Case
        if(mainStr.isEmpty())
        {
            System.out.println(ansStr);
            return;
        }
        char ch=mainStr.charAt(0);
        // Iterate through each index and swap
        for(int i=0;i<=ansStr.length();i++)
        {
            String f=ansStr.substring(0,i);
            String l=ansStr.substring(i,ansStr.length());
            String a=f+ch+l;
            stringPermutations(a, mainStr.substring(1));
        }
    }
    public static String []mappings={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypadCombinations(String digits,String ans,int index)
    {
        // Base case
        if(index>=digits.length())
        {
            System.out.println(ans);
            return;
        }
        // loop through all the chars at each digit index in the mapping array
        int dind=Integer.parseInt(digits.charAt(index)+"");
        String curr=mappings[dind];
        for(int i=0;i<curr.length();i++)
        {
            ans+=curr.charAt(i);
            keypadCombinations(digits, ans, index+1);
            // backtrack remove the element after printing for next recursion use
            ans=ans.substring(0,ans.length()-1);
        }
    }
    public static void arrPermutations(int arr[],int ind)
    {
        if(ind>=arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // loop from curr ind to end and swap curr ind with each next element
        for(int i=ind;i<arr.length;i++)
        {
            swaP(arr,ind,i);
            arrPermutations(arr, ind+1);
            swaP(arr,ind,i);
        }
    }
    public static void swaP(int arr[],int x,int y)
    {
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }
    // Dice combinations for a target sum
    public static void dice(String combination,int target)
    {
        if(target==0)
        {
            System.out.println(combination);
            return;
        }

        // loop from 1 to 6 put each in combination and also subtract from target
        for(int i=1;i<=6 && i<=target;i++)
        {
            // combination=combination+i; // combination ko reassign karne se is iteration ki value loop ke agle iterations me leak ho jaati hai.
            dice(combination+i, target-i);
        }
    }
    // Maze problem (Ways to reach a point in maze 2D array)
    // we can go only in two directions right and down
    // we have to reach at last cell in the 2D array matrix
    public static int Mazecount(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int down=Mazecount(r-1, c);
        int right=Mazecount(r,c-1);
        return down+right;
    }
    public static void mazePath(String path,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(path);
            return;
        }
        if(r>1)
        mazePath(path+"D", r-1, c);
        if(c>1)
        mazePath(path+"R", r, c-1);
    }
    public static void mazePathDig(String path,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(path);
            return;
        }
        if(r>1 && c>1)
        {
            mazePathDig(path+"d", r-1, c-1);
        }
        if(r>1)
        mazePathDig(path+"D", r-1, c);
        if(c>1)
        mazePathDig(path+"R", r, c-1);
    }
    public static ArrayList<String> mazePathL(String path,int r,int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1)
        {
            list.addAll(mazePathL(path+"D", r-1, c));
        }
        if(c>1)
        {
            list.addAll(mazePathL(path+"R", r, c-1));
        }
        return list;
    }
    public static void mazePathObs(String path,boolean maze[][],int r,int c)
    {
        if(!maze[r][c])
        {
            return;
        }
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        if(r<maze.length-1)
        {
            mazePathObs(path+"D", maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            mazePathObs(path+"R", maze, r, c+1);
        }
    }
    // rat in a maze all directions
    public static void mazeAllPaths(String path,boolean maze[][],int r,int c)
    {
        // If Reached at the destination Print the path and return;
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        // If the cell is marked as false already means there is the obstacle so we return
        if(!maze[r][c])
        {
            return;
        }
        // Marking a cell as Visited (When the cell is not visited already)
        // false means visited (true means unvisited)
        maze[r][c]=false;
        // Down: row+1
        if(r<maze.length-1)
        {
            mazeAllPaths(path+"D", maze, r+1, c);
        }
        // Right: col+1
        if(c<maze[0].length-1)
        {
            mazeAllPaths(path+"R", maze, r, c+1);
        }
        // Left: col-1;
        if(c>0)
        {
            mazeAllPaths(path+"L", maze, r, c-1);
        }
        // Up: row-1
        if(r>0)
        {
            mazeAllPaths(path+"U", maze, r-1, c);
        }
        // Backtracking Step
        // When we go back to prev step 
        // We change back the change we made in this step
        // Keeping the data in prev state i.e reverting the currently made changes
        maze[r][c]=true;
    }
    public static void main(String[] args) {
        // dice("", 6);
        System.out.println(Mazecount(3, 3));
        // mazePath("", 3, 3);
        System.out.println(mazePathL("", 3, 3));
        // mazePathDig("", 3, 3);
        boolean maze[][]={{true,true,true},{true,true,true},{true,true,true}};
        // mazePathObs("", maze, 0, 0);
        mazeAllPaths("", maze, 0, 0);
    }
}