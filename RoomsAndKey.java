class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        HashSet<Integer> visited = new HashSet<Integer>();
        visited.add(0);
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        while(!stack.isEmpty())
        {
            List<Integer> keys = rooms.get(stack.pop());
            for(int key : keys)
            {
                if(!visited.contains(key))
                {
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        
        return visited.size() == rooms.size();
    }
}
