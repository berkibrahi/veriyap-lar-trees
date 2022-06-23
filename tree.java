package trees;



public class tree {
 node root;
 node t1;
 node t2;

public tree() {
	root=null;
}
node newnode(int data) {
	root=new node(data);
	return root;
}
 int max(node root) {
	
	
	while(root.right!=null) {
		root=root.right;
	}
	
	return root.veri;
	
}
  int min(node root) {
	
	node t=root;
	while(t.left!=null) {
		t=t.left;
	}
	
	return t.veri;
	
}
node insert(node root,int data) {
	if(root!=null) {
		if(root.veri>data) {
			root.left=insert(root.left, data);}
			else {
				root.right=insert(root.right, data);
			}
	}
		else {
			root=newnode(data);
		}
		return root;
	}
void preorder(node root) {
	if(root!=null) {
	System.out.print(root.veri + " ");
	preorder(root.left);
	preorder(root.right);
	}
}

void inorder(node root) {
	if(root!=null) {
	
	inorder(root.left);
	System.out.print(root.veri + " ");
	inorder(root.right);
	}
}
void postorder(node root) {
	if(root!=null) {
	
	postorder(root.left);
	
	postorder(root.right);
	System.out.print(root.veri + " ");
	}
}
node sil(node root, int x) {
	if(root==null) {
	
		System.out.println("silincek agac kalmadi");
		return null;
	}

	if(root.veri==x) {
		if(root.right==null && root.left==null) {
	
			root=null;
			System.out.println("iki tarfi nul calisti");
			return null;
			
		}
	
		else if(root.left==null) {
			t1=root.right;
			System.out.println("sol trafý null calisti");
			return t1;
			}
			
				
		
	else if(root.right==null) {
		t1=root.left;
		System.out.println("sag trafý null calisti");
		return t1;
		}
	else if(root.left!=null) {
		System.out.println("dsaknsjxs");
		root.veri=max(root.left);
		root.left=sil(root.left, max(root.left));
		
		return root;
	}
	else if(root.right!=null) {
		System.out.println("halo");
		root.veri=min(root.right);
		root.right=sil(root.right, min(root.right));
		return  root;
	}
	}
	else {
		if(root!=null) {
			if(x<root.veri) {
			root.left=	sil(root.left, x);
			}
			else {
				root.right=sil(root.right, x);
			}
		}
	}
	return root;
}
}	
	
	
	
	
	 
 
 

