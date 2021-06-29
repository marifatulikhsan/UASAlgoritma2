package BinaryTree;
public class BinaryTreeApp {
    public static void main(String[] args) {
        var tree = new BinaryTree();
        
        TreeNode node;
        node = new TreeNode(60);
        tree.insert(node);
        
        node = new TreeNode(40);
        tree.insert(node);
        
        node = new TreeNode(30);
        tree.insert(node);
        
        node = new TreeNode(50);
        tree.insert(node);
        
        node = new TreeNode(80);
        tree.insert(node);
     
        
        System.out.println("\nTraversal dengan InOrder : " );
        tree.inOrder();
        System.out.println("\nTraversal dengan Preorder : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan PostOrde : " );
        tree.postOrder();
        System.out.println();    
  }
}