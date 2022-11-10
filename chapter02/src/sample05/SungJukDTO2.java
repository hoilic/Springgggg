package sample05;

import lombok.Data;

@Data
public class SungJukDTO2 {
	
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
	}
	
	@Override
	public String toString() {
		calc();
		return (name + "\t"
				+ kor +"\t"
				+ eng+"\t" 
				+ math+"\t" 
				+ tot+"\t" 
				+ avg);
	}
	
}
