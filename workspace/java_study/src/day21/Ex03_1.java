package day21;
/*
 * # �޼����� ����[3�ܰ�] : ���ϰ��� �ִ� �޼���
 * int getNum(�Ű�����[parameter]){
 * 		������ ����;
 * 		return 10;
 * } 
 *
 * # �޼����� ���(ȣ��)
 * int num = getNum(����,�μ�[argument]);
 */

class Ex03{
	int num;
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
}
public class Ex03_1 {
	public static void main(String[] args) {
		Ex03 e = new Ex03();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);
	}
}
