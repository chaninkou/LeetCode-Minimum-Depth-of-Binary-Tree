package leetcode111;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalFunction {
	public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        // If it is not null, it already have one level
        int depth = 1;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove();
                
                // If we see no children, return this current level
                if(current.left == null && current.right == null){
                    return depth;
                }
                
                if(current.left != null){
                    queue.add(current.left);
                }
                
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            
            depth++;
        }
        
        return depth;
    }	
}
