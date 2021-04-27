package com.java.mphasis.project;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
class DateDiff{
   public static void main(String args[]){
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
	 Scanner sc=new Scanner(System.in);
	 String leavestartdate,leaveenddate;
	 System.out.println("Enter leave start date");
	 leavestartdate=sc.nextLine();
	 System.out.println("Enter leave end date");
	 leaveenddate=sc.nextLine();
	 
	 

	try {
	       Date dateBefore = myFormat.parse(leavestartdate);
	       Date dateAfter = myFormat.parse(leaveenddate);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               
	       System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       //e.printStackTrace();
	 }
   }
}
	