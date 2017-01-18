import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Domaca3 {
	public static String PATH="Studenti.txt";
	public static File f = new File(PATH);
	public static int num=1;
	public static String thisLine = null;
	public static boolean exit=false;
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<String> genderList = new ArrayList();
	public static ArrayList classList = new ArrayList();
	public static ArrayList ageList = new ArrayList();
	
	
	
	public static void main(String[] args) {
		
		
		
		do{
			MenuShow();
			String choiceS=sc.next();
			int choice=0;
			try{
			      choice = Integer.parseInt(choiceS.toString());
			     	}
			     
			      catch (Exception e)         
		                  {
			System.out.println("Wrong input. Please try again.");					
		                  }
			     
			
			switch(choice){
			
			case 1:
				 
		            ShowStudents();
		        				       
			break;
			
			case 2:
				Average();
			break;
			
			case 3:
				AddStudent();
				
				break;
				
			case 4: exit=true;
				break;
			
				default: System.out.println("Wrong input.");
			}
	
			
			
			
		}while(exit==false);
		
		
		
		
		
		
		
	}
	
	public static void MenuShow(){
		System.out.println("---------------------");
		System.out.println("1. Show all students ");
		System.out.println("2. Average ");
		System.out.println("3. Add new student ");
		System.out.println("4. Exit ");
		System.out.println("---------------------");
		
	}
	
	public static void ShowStudents(){
	
		try{
        BufferedReader br = new BufferedReader(new FileReader(PATH));
	         while ((thisLine = br.readLine()) != null) {
	        	 String string = (thisLine);
	String[] parts = string.split(",");
   num++;
         
	
   if(parts.length==11){
		String name = parts[0]; 
	String surname = parts[1];
	String gender = parts[2];
	String Class = parts[3];
	String age = parts[4];
	String subject1 = parts[5];					
	String gradeSubject1 = parts[6];
	String subject2 = parts[7];
	String gradeSubject2 = parts[8];
	String subject3 = parts[9];
	String gradeSubject3 = parts[10];
	
System.out.println(name+" "+surname+" "+gender+" "+Class+" "+age+" "+subject1+"-"+gradeSubject1+" "+subject2+"-"+gradeSubject2+" "+subject3+"-"+gradeSubject3);  
	}
   
   if(parts.length==13){
		String name = parts[0]; 
	String surname = parts[1];
	String gender = parts[2];
	String Class = parts[3];
	String age = parts[4];
	String subject1 = parts[5];					
	String gradeSubject1 = parts[6];
	String subject2 = parts[7];
	String gradeSubject2 = parts[8];
	String subject3 = parts[9];
	String gradeSubject3 = parts[10];
	String subject4 = parts[11];
	String gradeSubject4 = parts[12];
	
	          
	         System.out.println(name+" "+surname+" "+gender+" "+Class+" "+age+" "+subject1+"-"+gradeSubject1+" "+subject2+"-"+gradeSubject2+" "+subject3+"-"+gradeSubject3+" "+subject4+"-"+gradeSubject4);  
	}
   
if(parts.length==9){
	String name = parts[0]; 
	String surname = parts[1];
	String gender = parts[2];
	String Class = parts[3];
	String age = parts[4];
	String subject1 = parts[5];					
	String gradeSubject1 = parts[6];
	String subject2 = parts[7];
	String gradeSubject2 = parts[8];

	          
	         System.out.println(name+" "+surname+" "+gender+" "+Class+" "+age+" "+subject1+"-"+gradeSubject1+" "+subject2+"-"+gradeSubject2);  
}

if(parts.length==7){
	String name = parts[0]; 
	String surname = parts[1];
	String gender = parts[2];
	String Class = parts[3];
	String age = parts[4];
	String subject1 = parts[5];					
	String gradeSubject1 = parts[6];
	

	          
	         System.out.println(name+" "+surname+" "+gender+" "+Class+" "+age+" "+subject1+"-"+gradeSubject1);  
}
	 
         
	         }       
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	      }
	
	public static void Average(){
		System.out.println("Based on what you want to average students?");
		System.out.println("---------------------");
		System.out.println("1. Class ");
		System.out.println("2. Age ");
		System.out.println("3. Gender ");
		System.out.println("4. Subject ");
		System.out.println("---------------------");
		String random = sc.nextLine();
		String choiceAverage1 = sc.nextLine();
		 try{
			int choiceAverage = Integer.parseInt(choiceAverage1.toString()); 
			
			switch(choiceAverage){
		case 1:
			AverageClass(); 	            
		break;
		
		case 2:
			AverageAge(); 	            

		break;
		
		case 3:
			AverageGender(); 	            
		
		break;
			
		case 4: 
			AverageSubject(); 	            

		break;
		
			default: System.out.println("Wrong input.");
		 }
		 } catch(Exception e){
			System.out.println("Wrong input"); 
		 }
		
		 
		
	}
	
	
	public static void AddStudent(){
		System.out.println("Type a name: ");
		String AddName1 = sc.nextLine();
		String AddName = sc.nextLine();
		System.out.println("Type a surname: ");
		String AddSurname = sc.nextLine();
		System.out.println("Type a gender: ");
		String AddGender = sc.nextLine();
		System.out.println("Type a class: ");
		String AddClass = sc.nextLine();
		System.out.println("Type an age: ");
		String AddAge = sc.nextLine();
		
		System.out.println("How many subject would you like to add? (1-4) ");
		String choiceHowMany1 = sc.nextLine();
		 try{
			 int choiceHowMany = Integer.parseInt(choiceHowMany1.toString());
		     	if(choiceHowMany==1){
			System.out.println("Type first subject: ");
			String AddSubject1 = sc.nextLine();
			System.out.println("Type grade from first subject: ");
			String AddGradeSubject1 = sc.nextLine();
			
			Path p = Paths.get(PATH);
			String s = System.lineSeparator() + AddName+","+AddSurname+","+AddGender+","+AddClass+","+AddAge+","+AddSubject1+","+AddGradeSubject1;
			
			try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
			    writer.write(s);
			} catch (IOException ioe) {
			    System.err.format("IOException: %s%n", ioe);
			}
			
		}
		
		if(choiceHowMany==2){
			System.out.println("Type first subject: ");
			
			String AddSubject1 = sc.nextLine();
			System.out.println("Type grade from first subject: ");
			String AddGradeSubject1 = sc.nextLine();
			System.out.println("Type second subject: ");
			String AddSubject2 = sc.nextLine();
			System.out.println("Type grade from second subject: ");
			String AddGradeSubject2 = sc.nextLine();	
			
			Path p = Paths.get(PATH);
			String s = System.lineSeparator() + AddName+","+AddSurname+","+AddGender+","+AddClass+","+AddAge+","+AddSubject1+","+AddGradeSubject1+","+AddSubject2+","+AddGradeSubject2;
			
			try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
			    writer.write(s);
			} catch (IOException ioe) {
			    System.err.format("IOException: %s%n", ioe);
			}
			
		}
		
		if(choiceHowMany==3){
			System.out.println("Type first subject: ");
			String AddSubject1 = sc.nextLine();
			System.out.println("Type grade from first subject: ");
			String AddGradeSubject1 = sc.nextLine();
			System.out.println("Type second subject: ");
			String AddSubject2 = sc.nextLine();
			System.out.println("Type grade from second subject: ");
			String AddGradeSubject2 = sc.nextLine();
			System.out.println("Type third subject: ");
			String AddSubject3 = sc.nextLine();
			System.out.println("Type grade from third subject: ");
			String AddGradeSubject3 = sc.nextLine();
			
			Path p = Paths.get(PATH);
			String s = System.lineSeparator() + AddName+","+AddSurname+","+AddGender+","+AddClass+","+AddAge+","+AddSubject1+","+AddGradeSubject1+","+AddSubject2+","+AddGradeSubject2+","+AddSubject3+","+AddGradeSubject3;
			
			try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
			    writer.write(s);
			} catch (IOException ioe) {
			    System.err.format("IOException: %s%n", ioe);
			}
			
		}
		
		if(choiceHowMany==4){
			System.out.println("Type first subject: ");
			
			String AddSubject1 = sc.nextLine();
		System.out.println("Type grade from first subject: ");
		String AddGradeSubject1 = sc.nextLine();
		System.out.println("Type second subject: ");
		String AddSubject2 = sc.nextLine();
		System.out.println("Type grade from second subject: ");
		String AddGradeSubject2 = sc.nextLine();
		System.out.println("Type third subject: ");
		String AddSubject3 = sc.nextLine();
		System.out.println("Type grade from third subject: ");
		String AddGradeSubject3 = sc.nextLine();
		System.out.println("Type forth subject: ");
		String AddSubject4 = sc.nextLine();
		System.out.println("Type grade from forth subject: ");
		String AddGradeSubject4 = sc.nextLine();
		
		Path p = Paths.get(PATH);
		String s = System.lineSeparator() + AddName+","+AddSurname+","+AddGender+","+AddClass+","+AddAge+","+AddSubject1+","+AddGradeSubject1+","+AddSubject2+","+AddGradeSubject2+","+AddSubject3+","+AddGradeSubject3+","+AddSubject4+","+AddGradeSubject4;
		
		try  {
			Files.write(p, s.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException ioe) {
		    System.err.format("IOException: %s%n", ioe);
		}
		
		}
		
		if(choiceHowMany<1 || choiceHowMany>4){
			System.out.println("You can add max 4 and min 1 subject.");
			
		}
		}
		     
		      catch (Exception e)         
	                  {
		
		    	  System.out.println("Wrong Input.");
	                  }
		
		
		
		
	}
	
	public static void AverageClass(){
		
		try{
	        BufferedReader br = new BufferedReader(new FileReader(PATH));
		         while ((thisLine = br.readLine()) != null) {
		        	 String string = (thisLine);
		String[] parts = string.split(",");
	   
	
		String Class = parts[3];
		
System.out.println(Class);
		         }       
		      }catch(Exception e){
		         e.printStackTrace();
		      }
	}

	public static void AverageAge(){
		
	}
	
public static void AverageGender(){
		
	}

public static void AverageSubject(){
		
	}
	
	}
	

