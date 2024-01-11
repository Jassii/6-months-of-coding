class Solution 
{
    boolean isHeap(Node tree) 
    {
        // code here
    
        if(tree==null)
        {
            return true;
        }
        
        boolean seen=false;
        Queue<Node> q = new LinkedList<>();
        q.add(tree);
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left!=null)
            {
                if(temp.left.data>temp.data)
                {
                    return false;
                }
                q.add(temp.left);
            }
            else
            {
                seen=true;
            }
            if(temp.right!=null)
            {
                if(seen==true || temp.right.data>temp.data)
                {
                    return false;
                }
                q.add(temp.right);
            }
            else
            {
                seen=true;
            }
        }
        return true;
    }
}
