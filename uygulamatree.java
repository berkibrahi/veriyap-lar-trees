package trees;

import java.util.Stack;

public class uygulamatree {

	public static void main(String[] args) {
	
tree tree=new tree();
		tree.root=tree.insert(tree.root, 10);
		tree.root=tree.insert(tree.root, 8);
	tree.root=tree.insert(tree.root, 15);
		tree.root=tree.insert(tree.root, 5);
		tree.root=tree.insert(tree.root, 12);
	tree.root=tree.insert(tree.root, 20);
		tree.root=tree.insert(tree.root, 9);
		tree.root=tree.insert(tree.root,30);
		tree.root=tree.insert(tree.root,25);
	//	tree.preorder(tree.root);
		System.out.println();
		tree.inorder(tree.root);
		System.out.println();
	//tree.max(tree.root.left);
	tree.root=tree.sil(tree.root,5);
	tree.root=tree.sil(tree.root, 9);	
	tree.root=tree.sil(tree.root, 20);
	tree.root=tree.sil(tree.root,30);
		tree.inorder(tree.root);
}
}