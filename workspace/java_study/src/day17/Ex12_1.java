package day17;

public class Ex12_1 {
	public static void main(String[] args) {
		String nameData = "";
		nameData +=	"100001/�̸���";	nameData += "\n";		
		nameData += "100002/�̿���";	nameData += "\n";
		nameData += "100003/���缮";	nameData += "\n";
		nameData += "100004/�ڸ��";	nameData += "\n";
		nameData += "100005/�ֿ���";	nameData += "\n";
		nameData += "100006/�ں���";
		
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
		
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		/*
		 * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
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
		
		/*1) moneyData���� ��ȣ�� ���� ���� ã�´�.
		data += moneyData[0];
		2) ���� ���� ã����,
			nameData���� �ش� ��ȣ�� �̸��� �����Ѵ�.
		data += nameData[0];
		3) �ٽ� moneyData�� 1��° �ε����� �����Ѵ�.
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
