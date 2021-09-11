package day33;

import java.text.SimpleDateFormat;
import java.util.Date;

class StopWatch extends Thread{
	public String timeText;
	long time = 0l;
	long preTime = 0l;
	boolean play = true;
	
	// Thread Ŭ�����ȿ� �ִ� �޼���
	public void run() {
		// ����ð� �ʷ� ��ȯ�� ��
		preTime = System.currentTimeMillis();
		
		System.out.println(preTime);
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = timeFormat.format(new Date(preTime));
		System.out.println(str);
		System.out.println(new Date(preTime));

		while(play) {
			try {
				sleep(10);
				time = System.currentTimeMillis() - preTime;
				int m = (int)(time/1000.0/60.0);
				int s = (int)(time%(1000.0*60)/1000.0);
				int ms = (int)(time%1000/10.0);
				System.out.println(m+" : " +s+" "+ms);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex04 {
	public static void main(String[] args) {
		StopWatch st = new StopWatch();
		st.start();
	}
}
