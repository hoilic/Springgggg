package sample05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class SungJukDelete implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);

		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();

		int sw = 0;
		Iterator<SungJukDTO2> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next(); // 항목을 하나씩 꺼내온다.

			if (sungJukDTO2.getName().equals(name)) { // 번호 입니까? 맞다면 아래 출력
				sw = 1;
				it.remove();
				System.out.println(name + "님의 데이터를 삭제했습니다");
			}
		} // while

		if (sw == 0)
			System.out.println("찾고자하는 이름이 없습니다");

	}

}
