package sample05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukDelete implements SungJuk {

	private SungJukDTO2 sungJukDTO2;
	private ArrayList<SungJukDTO2> list;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		
		int count=0;
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next(); 
			if(sungJukDTO2.getName().equals(name)) {
				it.remove(); 
				//it.remove()는 반드시 it.next()가 반환하는 항목을 지운다.
				count++;
			}
		}//while
		
		if(count == 0)
			System.out.println("찾고자하는 이름이 없습니다");
		else
			System.out.println(name + "님의 데이터를 삭제했습니다");

	}

}
