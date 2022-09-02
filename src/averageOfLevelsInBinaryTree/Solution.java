package averageOfLevelsInBinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    private final List<double[]> store = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();
        dfs(root, 0);
        for(double[] cur: store){
            res.add(cur[0]/cur[1]);
        }
        return res;
    }

    private void dfs(TreeNode node, int lvl){

        if(node == null) return;

        if(store.size() <= lvl) store.add(new double[2]);
        store.get(lvl)[0] += node.val;
        store.get(lvl)[1]++;

        dfs(node.left, ++lvl);
        dfs(node.right, lvl);
    }

    public List<Double> averageOfLevelsBFS(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int sz = queue.size();
            double avg = 0;
            for (int i = 0; i < sz; i++){
                TreeNode node = queue.poll();
                avg += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(avg / sz);
        }
        return result;
    }
}
