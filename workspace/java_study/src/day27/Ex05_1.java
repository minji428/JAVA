package day27;
/*
 * # �迭�� �Ѱ�
 * - �迭�� �ѹ� �����ϸ� ���α׷����� �� ũ�⸦ �ٲ� �� ����.
 * 
 * # java.util.ArrayList
 * - ArrayList Ŭ������ �����Ͱ� �ԷµǸ�, �ڵ����� ũ�Ⱑ Ŀ����
 * - �����Ͱ� ���ŵǸ�, �ڵ����� ũ�Ⱑ �۾�����.
 * - �߰��� �����Ͱ� ���ԵǸ�, �����Ͱ� ���Ե� ��ġ���� ��� �����Ͱ� �ڷ� �̵��ǰ�
 * - �߰��� �����Ͱ� ���ŵ� ���� ��ġ���� ��� �����Ͱ� ������ �̵��Ѵ�.
 * 
 * # <E>
 * - ���׸�(generic)�̶� �θ��� ArrayList�� ����� ������ Ÿ����
 *   �ݵ�� Ŭ������ �ۼ��Ѵ�.
 * - �⺻ �ڷ��� �����͸� �����ϴ� ArrayList�� ������ �ϴ� ��쿡��
 *   ���� Ŭ������ ����Ѵ�.
 *   
 *   ArrayList list = new ArrayList();                        // JDK 1.4 ����
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 ����
 *   ArrayList<Integer> list = new ArrayLIst<>();            // JDK 1.7 ����
 */

import java.util.ArrayList;

class MyVector{
	int arr[];
	int count = 0;
	
	void add(int a) {
		if(count == 0) {
			arr = new int[1];
		}else {
			int[] temp = arr;
			arr = new int[count +1];
			for(int i=0; i<count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = a;
		count += 1;
	}
	
	int size() {
		return count;
	}
	
	void remove(int index) {
		int[] temp = arr;
		arr = new int[count-1];
		for(int i=0; i<index; i++) {
			arr[i] = temp[i];
		}
		for(int i = index; i<count-1; i++) {
			arr[i] = temp[i+1];
		}
		count -= 1;
	}
}

public class Ex05_1 {
	public static void main(String[] args) {
		
		//int[] arr = new int[5];
		
		ArrayList<Integer>list = new ArrayList<>();
		
		// add(value) : ArrayList�� �� �ڿ� value�� �߰��Ѵ�.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// add(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		System.out.println("add");
		list.add(0,9);
		System.out.println(list);
		
		// remove(index) : ArrayList�� index��° �����͸� �����Ѵ�.
		System.out.println("remove");
		list.remove(3);
		System.out.println(list);
		
		// size() : ArrayList�� ����� �������� ������ ���´�.
		int count = list.size();
		System.out.println("count = "+count);
		
		// get() : ArrayList�� index��°�� value�� ���´�.
		System.out.println("get");
		System.out.print("[");
		for(int i=0; i<count; i++) {
			System.out.print(list.get(i));
			if( i!= count -1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// set(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		System.out.println("set");
		list.set(3, 5);
		System.out.println(list);
		
		/*
		 * # ���� for��
		 *   1) �迭�̳� ArrayList ��ü �����͸� ������� �۾��� ��� ����Ѵ�.
		 *   2) ����
		 *   	for(�ڷ��� ������ : �迭 or ArrayList){
		 *   		 �ݺ��� ����;
		 *   	}
		 */
		
        // list�� 0��° ���� num�� ������ �� �ݺ��� �����ϸ�
        // list�� ������ ���� num�� ������ �� �ݺ��� ���� ����ȴ�.
		System.out.println("for");
		for(int num : list) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("clear");
        // clear() : ArrayList�� ��� �����͸� �����Ѵ�.
		list.clear();
		System.out.println(list.size());

	}
}


