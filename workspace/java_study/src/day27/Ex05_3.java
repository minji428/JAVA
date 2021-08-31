package day27;

import java.util.ArrayList;

class Tv{
	String name;
	String brand;
	int price;
	
	Tv(String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

class MyList2{
	Tv[] arr;
	int count;
	
	void add(Tv e) {
		/*if(count == 0) {
			if(count == 0) {
				arr = new Tv[count+1];
			}else if(count >0) {
				Tv[] temp = arr;
				
				arr = new Tv[count +1];
				for(int i=0; i<count; i++) {
					arr[i] = temp[i];
				}
				arr[count] = e;
				count += 1;
			}
		}	*/
		if (count == 0) {
			arr = new Tv[count + 1];
		} else if (count > 0) {
			Tv[] temp = arr;

			arr = new Tv[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = e;
		count += 1;


	}
	
	int size() {
		return count;
	}
	
	void remove(int index) {
		if(count == 1) {
			arr = null;
			count = 0;
		}else if(count >1) {
			Tv[] temp = arr;
			arr = new Tv[count-1];
			int j=0;
			for(int i=0; i<count; i++) {
				if(i!=index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
		}
		count -=1;
	}
	Tv get(int index) {
		return arr[index];
	}
		
}

/*class User{
	int a;
	
}*/

public class Ex05_3 {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<>();
		//ArrayList<User> list2 = new ArrayList<>();
		Tv temp = new Tv("TV", "�Ｚ", 1000);
		list.add(temp);
		
		temp = new Tv("�ñ״�óTV", "����", 2000);
		list.add(temp);
		
		temp = new Tv("����ƮTV", "����", 3000);
		list.add(temp);
		
		temp = list.get(1);
		System.out.println(temp.name);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).name + " / "+list.get(i).brand+ " / "+list.get(i).price);
		}
		
		// --------------------------------
		MyList2 myList = new MyList2();
		temp = new Tv("TV2", "�Ｚ", 1000);
		myList.add(temp);
		
		temp = new Tv("�ñ״�óTV2", "����", 2000);
		myList.add(temp);

		temp = new Tv("����ƮTV2", "����", 3000);
		myList.add(temp);
		
		temp = myList.get(1);
		System.out.println(temp.name);
	}
}
