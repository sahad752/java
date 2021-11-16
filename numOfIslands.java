class HelloWorld {
    public static void main(String[] args) {

        Solution1 sol = new Solution1();
		char a[][] = {{'1', '0', '0', '0'}, {'1', '0', '1', '0'}, {'0', '0', '1', '1'}};
		int ab = sol.numIslands(a);
        System.out.println(ab);
        // Student s = new Student();
        // System.out.println(s.name);
    }
}

class Student{  
    int id;  
    String name;  
 }  


class Solution1 {
    public int numIslands(char[][] grid) {
        
        if(grid.length==0||grid==null)
        {
            return 0;
        }
        
        int numsIslands = 0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    numsIslands+=dfs(grid,i,j);

                }
            }
        }
        return numsIslands;
    }
        
   public int dfs(char[][] grid,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j >= grid[i].length || grid[i][j] =='0' )
        {
            return 0;
        }
       grid[i][j]='0';
       System.out.println(i+" "+j);
       dfs(grid,i+1,j);
       dfs(grid,i-1,j);
       dfs(grid,i,j+1);
       dfs(grid,i,j-1);
       
        return 1;

       
    }
        
        
}
