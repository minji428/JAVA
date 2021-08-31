package day26;

/* 은닉성 : 
 * C에서는 main이 항상 마지막에 있었어야지만 실행이 되었지만
 * java에서는 그거랑 상관없이 main이 먼저 써 있어도 실행이 가능
 */
public class Ex04_5 {
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		// t.hour = 13;
		t.setHour(t.getHour()+1);	// 현재 시간보다 1시간 후로 변경
		System.out.println(t);
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0||hour>23) return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>59) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0||second>59) return;
		this.second = second;
	}
	public String toString() {
		return hour + " : "+minute+" : "+second;
	}
}
