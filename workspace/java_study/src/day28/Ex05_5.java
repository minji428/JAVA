package day28;

import java.util.Vector;

class ST{
	int num;
	String name;
}

class St_manager{
	static int count = 0;
	static Vector<ST> list = new Vector<ST>();
}

public class Ex05_5 {
	public static void main(String[] args) {
		ST st = new ST();
		st.num = 10001;
		st.name = "��ö��";
		St_manager.list.add(st);
		st = new ST();
		st.num = 10002;
		st.name = "�ֿ���";
		St_manager.list.add(st);
	}
}
