package DataStructure;

public class DListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DList dList = new DList();

		dList.insertNodeHead(100);
		dList.insertNodeHead(12);
		dList.insertNodeHead(13);
		dList.insertNodeHead(30);
		dList.print();

		System.out.println();

		dList.delNodeFront();
		dList.delNodeFront();

		dList.delNodeTail();

		dList.print();

	}

}
