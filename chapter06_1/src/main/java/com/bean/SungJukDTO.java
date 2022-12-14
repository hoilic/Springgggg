package com.bean;

import lombok.Data;

@Data
public class SungJukDTO {
	String name;
	int kor, eng, math, tot;
	double avg;
	
//	public void tot(){
//		tot= kor+eng+math;
//		
//	}
//	public void avg(){
//		avg= (double)tot/3;
//		
//	}
}

