package Lec38;

public class BinaryTree_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.Display();
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();
		System.out.println(bt.find(30));
		System.out.println(bt.max());
		System.out.println(bt.ht());
		 bt.LevelOrder();
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
	}

}
