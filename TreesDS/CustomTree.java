package TreesDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Binary CustomTree 

public class CustomTree {
    static Scanner sc;
    TreeNode root;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    CustomTree() {
        sc = new Scanner(System.in);
    }

    public void makeTreeDS() {
        this.root = makeTree();
    }

    private TreeNode makeTree() {
        TreeNode n = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        n = new TreeNode(data);
        System.out.println("Enter left for " + n.data);
        n.left = makeTree();
        System.out.println("Enter Right for " + n.data);
        n.right = makeTree();
        return n;

    }

    public void createTree(int arr[]) {
        root = buildTree(arr, 0);
    }

    /**
     * 
     * @param arr   Array of eleements
     * @param index index for building tree
     * @return return the root node
     * @apiNote This is basically builduing from array represantation of tree
     */
    private TreeNode buildTree(int arr[], int index) {
        if (index >= arr.length) {
            return null;
        }
        TreeNode root = new TreeNode(arr[index]);
        root.left = buildTree(arr, 2 * index + 1);
        root.right = buildTree(arr, 2 * index + 2);
        return root;
    }

    public void InOrderTraversal() {
        InOrderTraversal(root);
    }

    private void InOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
    }

    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }

    private void PreOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public void PostOrderTraversal() {
        PostOrderTraversal(root);
    }

    private void PostOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void LevelOrderTraversal() {
        ArrayList<ArrayList<Integer>> ans = LevelOrderTraversal(root);
        System.out.println(ans);
    }

    private ArrayList<ArrayList<Integer>> LevelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelnum = queue.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelnum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            ans.add(subList);
        }
        return ans;
    }

    public int heightOfTree() {
        return heightOfTree(root);
    }

    private int heightOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightOfTree(root.left) + 1, 1 + heightOfTree(root.right));
    }

    // int count=0;
    public int numberOfLeafNodes() {
        return numberOfLeafNodes(root);
    }

    private int numberOfLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);

    }

    public int numberOfNonLeafNodes() {
        return numberOfNonLeafNodes(root);
    }

    private int numberOfNonLeafNodes(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return numberOfNonLeafNodes(root.left) + numberOfNonLeafNodes(root.right) + 1;
    }

    public int sumOfAllNodes() {
        return sumOfAllNodes(root);
    }

    private int sumOfAllNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
    }
}
