package com.company.binarytree;

import java.util.*;

public class BinaryTree {
    private static class Node{
        private int data;
        private Node left;
        private Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private static int index = -1;

    private BinaryTree(){}

    private static Node buildPreorder(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index], buildPreorder(nodes), buildPreorder(nodes));

        return newNode;
    }

    public static BinaryTree buildBinaryTree(int[] nodes, String method){
        BinaryTree bt = new BinaryTree();
        bt.root = buildPreorder(nodes);
        index = -1;
        return bt;
    }

    private void preOrderTraverse(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    private void inOrderTraverse(Node root){
        if(root==null){
            return;
        }

        inOrderTraverse(root.left);
        System.out.print(root.data+" ");
        inOrderTraverse(root.right);
    }

    private void postOrderTraverse(Node root){
        if(root==null){
            return;
        }

        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.data+" ");
    }

    public void traverse(String method){
        switch(method){
            case "preorder":
            System.out.println("****Preorder traversal****");
            preOrderTraverse(root);
            System.out.println();
            break;
            case "inorder":
            System.out.println("****Inorder traversal****");
            inOrderTraverse(root);
            System.out.println();
            break;
            case "postorder":
            System.out.println("****Postorder traversal****");
            postOrderTraverse(root);
            System.out.println();
            break;
            default:
            System.out.println("Invalid method, should be one of: 'preorder', 'inorder', 'postorder'.");
        }
    }

    public void levelOrderTraverse(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode = q.remove();

            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left!=null)
                    q.add(currentNode.left);
                if(currentNode.right!=null)
                    q.add(currentNode.right);
            }
        }
    }

    private int height(Node root){
        if(root==null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right)+1;
    }

    public int getHeight(){
        return height(root);
    }

    private int totalNodes(Node root){
        if(root == null){
            return 0;
        }

        int lc = totalNodes(root.left);
        int rc = totalNodes(root.right);

        return lc+rc+1;
    }

    public int getTotalNodes(){
        return totalNodes(root);
    }

    private int dataSum(Node root){
        if(root==null){
            return 0;
        }

        int sl = dataSum(root.left);
        int sr = dataSum(root.right);

        return root.data+sl+sr;
    }

    public int getDataSum(){
        return dataSum(root);
    }

    private int diameter(Node root){
        if(root == null){
            return 0;
        }
        int cd = height(root.left)+height(root.right)+1;
        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max(Math.max(ld, cd), rd);
    }

    public int getDiameter(){
        return diameter(root);
    }

    private boolean isIdentical(Node root, Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null || root.data!=subRoot.data){
            return false;
        }

        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }

        return true;
    }

    private boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean checkSubtree(BinaryTree bt){
        return isSubtree(this.root, bt.root);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = BinaryTree.buildBinaryTree(nodes, "preorder");

        bt.traverse("preorder");
        bt.traverse("inorder");
        bt.traverse("postorder");
        System.out.println("****Level order traversal****");
        bt.levelOrderTraverse();

        System.out.println("Height of the tree is: "+bt.getHeight());
        System.out.println("Total number of nodes: "+bt.getTotalNodes());
        System.out.println("Data sum: "+bt.getDataSum());
        System.out.println("Diameter of this tree: "+bt.getDiameter());

        int nodes2[] = {2,4,-1,-1,5,-1,-1};
        BinaryTree bt2 = BinaryTree.buildBinaryTree(nodes2, "preeorder");

        System.out.println("Is subtree: "+bt.checkSubtree(bt2));
    }
}
