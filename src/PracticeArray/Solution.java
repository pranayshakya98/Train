package PracticeArray;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Integer> queue= new LinkedList<>();
        int size= queue.size();
        List<Integer> currentLevel=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode current=queue.remove();
            currentLevel.add(current.val);
            if(current.left!=null){
                queue.add(current.left);
            }
            else if(current.right!=null){
                queue.add(current.right);
            }
        result.add(currentLevel);
        }
        return result;




    }

}
