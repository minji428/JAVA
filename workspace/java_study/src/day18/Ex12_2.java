package day18;

public class Ex12_2 {
	public static void main(String[] args) {
		String data = "10001/±èÃ¶¼ö/600\n";
		data += "10002/ÀÌ¿µÈñ/800\n";
		data += "10001/±èÃ¶¼ö/1400\n";
		data += "10003/À¯Àç¼®/780\n";
		data += "10002/ÀÌ¿µÈñ/950\n";
		data += "10004/¹Ú¸í¼ö/330\n";
		data += "10001/±èÃ¶¼ö/670\n";
		data += "10003/À¯Àç¼®/3300\n";
		data += "10002/ÀÌ¿µÈñ/200\n";
		data += "10004/¹Ú¸í¼ö/6800\n";
		data = data.substring(0 , data.length()-1); // ¸¶Áö¸· ±Û»èÁ¦ 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");

		int showNum[] = new int[totalSize];
		String showName[] = new String[totalSize];
		
		int showCount = 0;
		for(int i=0; i<totalSize; i++) {
			int check = 0;
			for(int j=0; j<i; j++) {
				if(showNum[j] == numList[i]) {
					check =1;
				}
			}
			if(check == 0) {
				showNum[showCount] = numList[i];
				showName[showCount] = nameList[i];
				showCount += 1;
			}
		}
		for(int i=0; i<showCount; i++) {
			System.out.println(showNum[i] + " " +showName[i]);
		}
		System.out.println("=====================");
		int showTotalprice[] = new int[totalSize];
		
		for(int h = 0; h < totalSize; h++) {
			for(int w = 0; w < showCount; w++) {
				if(showNum[w] == numList[h]) {
					showTotalprice[w] += priceList[h];
				}
			}		
		}
		for(int i = 0; i < showCount; i++) {
			System.out.println(showNum[i] + " " + showName[i] + " " +  showTotalprice[i]);
		}
		System.out.println("=====================");

	}
}
