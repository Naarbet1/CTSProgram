package com.oopsbased.program;

public class MarkAssesment {
	//Switch method
	public String average(int x, int y, int z) {
		int Avg;
		Avg = (x + y + z) / 3;
		if(x>40&&y>40&&z>40&&Avg<=100){
		switch (Avg / 10) {
		
		case 9:
			return "A+";
		case 8:
			return "A";
		case 7:
			return "A-";
		case 6:
			return "B+";
		case 5:
			return "B";
		case 4:
			return "Fail";
		case 3:
			return "Fail";
		case 2:
			return "Fail";
		case 1:
			return "Fail";
		case 0:
			return "Fail";
		}}else
			return "Fail";
		return "";
	}

	// If Else method
	public String grade(int m1,int m2,int m3){
		float avg=(m1+m2+m3)/3;
		if(m1>40&&m2>40&&m3>40){
		if(avg<=100){
		if(avg>=90&&avg<=100){
			return "A+";
		}
		else if(avg<90&&avg>=80){
			return "A";
		}
		else if(avg<80&&avg>=70){
			return "A-";
		}
		else if(avg<70&&avg>=60){
			return "B+";
		}
		else if(avg<60&&avg>=50){
			return "B";
		}
		else{
			return "Fail";
		}
		}else
		return "Enter mark properly";
		}
		else
			return "Fail";
}	}