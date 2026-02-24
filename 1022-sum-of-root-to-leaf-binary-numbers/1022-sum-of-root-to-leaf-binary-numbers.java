class Solution {
    public int calc(TreeNode root, int current){
        if(root == null) return 0;

        current = current * 2 + root.val;

        if(root.left == null && root.right == null){
            return current;
        }

        return calc(root.left, current) + calc(root.right, current);
    }

    public int sumRootToLeaf(TreeNode root) {
        return calc(root, 0);
    }
}