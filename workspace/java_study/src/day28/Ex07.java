package day28;

import java.util.Vector;

class Node2{
	int num;
	void printNode() {
		System.out.print(num+"\t");
	}
}

class NodeManager{
	Vector<Node2[]>nodeList;
	int data[][];
	final int SIZE = 5;
	void dataInit() {
		data = new int[SIZE][SIZE];
		int num = 1;
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				data[i][j] = num;
				num += 1;
			}
		}
	}
	void dataShuffle() {}
	void nodeInit() {
		nodeList = new Vector<>();
		
		for(int i = 0; i < SIZE; i++) {
			Node2 [] temp = new Node2[SIZE];
			for(int j = 0; j < SIZE; j++) {
				Node2 node = new Node2();
				node.num = data[i][j];
				//System.out.println(node.num);
				temp[j] = node;
			}
			nodeList.add(temp);
		}		
	}
	
	void printNodeList() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				nodeList.get(i)[j].printNode();
			}
			System.out.println();
		}		
	}	
	void init() {	
		dataInit();
		dataShuffle();
		nodeInit();
		printNodeList();
	}
	
}

public class Ex07 {
	public static void main(String[] args) {
		NodeManager nm = new NodeManager();
		nm.init();
	}
}
