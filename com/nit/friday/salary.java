package com.nit.friday;
public class salary {
	public static void main(String[] args) {
		int[] salaries= {4000,2300,5000,23000,45000,8000,
				9000,4700,5600};
		float average=0;
		for(int i=0;i<salaries.length;i++)
		{
			average=average+salaries[i];
		}
    average=average/salaries.length;
    System.out.println(average);
    for(int i=0;i<salaries.length;i++) {
    	if(salaries[i]<average)
    	{
    		salaries[i]=(int)(0.5*salaries[i]+salaries[i]);
    		System.out.println(salaries[i]);
    	}
    	else
    	System.out.println(salaries[i]);
    }
	}

}
