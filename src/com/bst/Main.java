package com.bst;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BST<Integer> bst=new BST<>();
        Random random =new Random();
        for(int i=0; i<20;++i)
            bst.insert(random.nextInt(50));
        bst.inorder();
        bst.preorder();
        bst.postorder();

        BST<String> bstString=new BST<>();
        String s="roses are red but not forever";
        String[] words=s.split(" ");
        for(String word:words)
            bstString.insert(word);
        bstString.inorder();
        bstString.preorder();
        bstString.postorder();
    }
}
