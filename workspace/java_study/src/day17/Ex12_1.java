package day17;

public class Ex12_1 {
	public static void main(String[] args) {
		String nameData = "";
		nameData +=	"100001/이만수";	nameData += "\n";		
		nameData += "100002/이영희";	nameData += "\n";
		nameData += "100003/유재석";	nameData += "\n";
		nameData += "100004/박명수";	nameData += "\n";
		nameData += "100005/최여정";	nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";	moneyData += "\n";	
		moneyData += "100003/7000";	moneyData += "\n";		
		moneyData += "100001/100";	moneyData += "\n";		
		moneyData += "100002/400";	moneyData += "\n";		
		moneyData += "100001/600";	moneyData += "\n";		
		moneyData += "100004/900";	moneyData += "\n";		
		moneyData += "100001/130";	moneyData += "\n";		
		moneyData += "100003/200";	moneyData += "\n";		
		moneyData += "100002/700";	moneyData += "\n";	
		moneyData += "100002/900";	moneyData += "\n";
		moneyData += "100004/800";
		//System.out.println(nameData);
		
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		/*
		 * 100001/이만수/600
		 * 100003/유재석/7000
		 * 100001/이만수/100
		 * 100002/이영희/400
		 * 100001/이만수/600
		 * 100004/박명수/900
		 * 100001/이만수/130
		 * 100003/유재석/200
		 * 100002/이영희/700
		 * 100002/이영희/900
		 * 100004/박명수/800
		 */

		String value[] = nameData.split("\n");
		String[][] nameList = new String[value.length][2];
		
		for(int i=0; i<nameList.length; i++) {
			String[] val = value[i].split("/");
			nameList[i][0] = val[0];
			nameList[i][1] = val[1];
			System.out.print(nameList[i][0]+" -> ");
			System.out.println(nameList[i][1]);
		}
		System.out.println("----------------");
		value = moneyData.split("\n");
		String[][] moneyList = new String[value.length][2];
	
		for(int i=0; i<moneyList.length; i++) {
			String[] val = value[i].split("/");
			moneyList[i][0] = val[0];
			moneyList[i][1] = val[1];
			System.out.print(moneyList[i][0]+" -> ");
			System.out.println(moneyList[i][1]);
		}
		System.out.println("----------------");
		String data ="";
		
		/*1) moneyData에서 번호가 같은 것을 찾는다.
		data += moneyData[0];
		2) 같은 것을 찾으면,
			nameData에서 해당 번호의 이름을 연결한다.
		data += nameData[0];
		3) 다시 moneyData의 1번째 인덱스를 연결한다.
		data += moneyData[1];*/
		
		for(int i=0; i<moneyList.length; i++) {
			for(int j=0; j<nameList.length; j++) {
				if(moneyList[i][0].equals(nameList[j][0])) {
					data += moneyList[i][0];
					data += "/";
					data += nameList[j][1];
					data += "/";
					data += moneyList[j][1];
					data += "\n";
				}
			}
		}
		
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
	}
}
