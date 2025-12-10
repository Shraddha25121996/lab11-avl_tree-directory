/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shraddhapatel
 */
public class AVLTreeDriver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insert values to trigger all rotations
        tree.insert(10);
        tree.insert(20);
        tree.insert(30); // LEFT rotation

        tree.insert(5);
        tree.insert(4);  // RIGHT rotation

        tree.insert(8);  // LEFT-RIGHT rotation

        tree.insert(25); // RIGHT-LEFT rotation

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();
    }

}
