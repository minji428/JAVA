package day13;

/*
 * 	# c���
 * 	1. �ڷ���
 * 		1) String ���� X => char�迭
 * 		2) ��(1), ����(0)
 *  2. �Լ�����
 *  3. ����ü ( ���� ) + �Լ�
 *  4. �迭
 * 		1) (���̰� ������)�迭
 * 			. stack ����
 * 			. int arr[3];
 * 		2) (���̰� ������)�迭
 * 			. heap ����
 * 			. int size = 3;
 * 			. int* p = new int[size];
 *  5. �ּҺ���
 *  	int num = 10;
 *  	int* p = &num;
 * 
 * 	# java���
 *  1. �ڷ���
 *  	1) String
 * 		2) ��(true), ����(false)
 *  2. Ŭ���� = �޼���(�Լ�) + ����
 *  3. �迭
 * 		1) (���̰� ������)�迭
 * 			. heap ����
 * 			. int size = 3;
 * 			. int[] arr = new int[size];
 *  4. �ּҺ���
 *  	1) �迭
 *  	2) Ŭ����
 *  5. �ڹٴ� heap �����Ǵ� �޸𸮵��� ���� �ڵ� �ʱ�ȭ�ȴ�.
 *  	* �迭 & Ŭ����
 *  	1) ���� : 0
 *  	2) �Ǽ� : 0.0
 *  	3) Ŭ���� : null
 */

class Student {
	String name;
	int age;
}

public class Ex00 {
	public static void main(String[] args) {
		
		double[] arr = new double[3];
		System.out.println(arr);			// [D@7852e922
		
		System.out.println(arr[0]);
		
		Student hgd = new Student();
		System.out.println(hgd);			// day13.Student@4e25154f
		System.out.println(hgd.age);
		System.out.println(hgd.name);
	}
}
