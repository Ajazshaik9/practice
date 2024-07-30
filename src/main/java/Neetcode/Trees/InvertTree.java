package Neetcode.Trees;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf2 = new TreeNode(3);
        TreeNode leaf3 = new TreeNode(6);
        TreeNode leaf4 = new TreeNode(9);

        TreeNode nodeRight = new TreeNode(7, leaf3, leaf4);
        TreeNode nodeLeft = new TreeNode(2, leaf1, leaf2);

        TreeNode root = new TreeNode(4, nodeLeft, nodeRight);

        invertTree(root);
        System.out.println(root);
    }
/*    public static class TreeNode {

        private int value;
        private TreeNode rightChild;
        private TreeNode leftChild;

        // Getters and setters

        public TreeNode(int value, TreeNode rightChild, TreeNode leftChild) {
            this.value = value;
            this.rightChild = rightChild;
            this.leftChild = leftChild;
        }

        public TreeNode() {
        }

        public TreeNode(int i) {
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }
    }

    private static void reverseRecursive(TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }

        TreeNode temp = treeNode.getLeftChild();
        treeNode.setLeftChild(treeNode.getRightChild());
        treeNode.setRightChild(temp);

        reverseRecursive(treeNode.getLeftChild());
        reverseRecursive(treeNode.getRightChild());
    }*/


    //Definition for a binary tree node.
     public static class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;

        invertTree(root.left);
        invertTree(root.right);

        //swap
        TreeNode tmp;
        tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        return root;
    }

}
