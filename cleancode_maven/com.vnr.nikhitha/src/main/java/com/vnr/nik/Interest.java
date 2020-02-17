package com.vnr.nik;
import java.util.*;
public class Interest {
	public float SimpleInterest()
    {
	   float principleAmount,time,rateOfInterest;
	   Scanner sc=new Scanner(System.in);
	   principleAmount=sc.nextFloat();
	   time=sc.nextFloat();
	   rateOfInterest=sc.nextFloat();
	   float simpleInterest=(principleAmount*time* rateOfInterest)/100;
	   return simpleInterest;
        
    }
    public double CompoundInterest()
    {
	   float principleAmount,time,rateOfInterest;
	   Scanner sc=new Scanner(System.in);
	   principleAmount=sc.nextFloat();
	   time=sc.nextFloat();
	   rateOfInterest=sc.nextFloat();
	   double compoundInterest=principleAmount*Math.pow((1.0+(rateOfInterest/100.0)),time);
	   return compoundInterest;
        
    }

}
