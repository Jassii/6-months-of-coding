//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    //create an inner class for the node and its height
    static class ChildNode
    {
        int hd;
        Node node;
        ChildNode(Node node,int hd)
        {
            this.hd = hd;
            this.node = node;
        }
    }
    
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        //final array list which will be returned
        ArrayList<Integer> result = new ArrayList<>();
        
        //creating a queue of (nodes&height)
        Queue<ChildNode> queue = new LinkedList<>();
        
        //creating a TreeMap which will store the data in the sorted manner(on the
        //the basis of key)
        Map<Integer,Node> map = new TreeMap<>();
        
        //add the root node along with its height to the queue.
        //root node's height will be 0
        queue.add(new ChildNode(root,0));
        
        //will be doing level order traversal and will maintain the height of each node
        //with the help of that will be taking the node and storing in the array.
        while(!queue.isEmpty())
        {
            ChildNode temp = queue.poll();
            
            //now putting the height and its Node in the hashmap
            //put in the map only when its not there..if it is there simply pass.
            //no need to update
            if(!map.containsKey(temp.hd))
            {
                map.put(temp.hd,temp.node);
            }
            
            //now will be checking that the left child and right child exists or not
            if(temp.node.left!=null)
            {
                queue.add(new ChildNode(temp.node.left,temp.hd-1));
            }
            if(temp.node.right!=null)
            {
                queue.add(new ChildNode(temp.node.right,temp.hd+1));
            }
        }
        //now we will a hashmap which will maintain the Node along with its height
        //traverse the hashmap and put each node in the array list
        //keys will be sorted
        for(Map.Entry<Integer,Node> m : map.entrySet())
        {
            result.add(m.getValue().data);
        }
        return result;
    }
}
