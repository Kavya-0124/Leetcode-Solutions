/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution
{
    public List<Integer> preorder(Node root) 
    {
       List<Integer> result = new ArrayList<>();
      preorder(root, result);
      return result;
    }
    
    private void preorder(Node node, List<Integer> result)
    {
      if(node == null)
        return;
      result.add(node.val);
      for(int i = 0; i < node.children.size(); i ++){
        preorder(node.children.get(i), result);
      }
    }
}