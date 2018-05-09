package pckg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pisomka952018 {
	public static String text="";
	public static String path="matica.txt";
	public static File file = new File(path);
	public static Scanner sc = new Scanner(System.in);
	public static String numbers="4,8,5,6,2,1,4,8,5,9,4,7,4,8,4,5";
	public static String keynumbers="";
	
	
	
	public static void txtgenerate() {

		
		try {
			if (file.createNewFile()) {
				System.out.println();		
				file.createNewFile();
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
					

					bw.write(numbers);
					bw.newLine();
					
				bw.flush();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
				
			} else {
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	public static void bfr(){

		text="";
		try {
			String thisLine = "";
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((thisLine = br.readLine()) != null) {
			text=text + thisLine;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public static void input() {
		int a=1;
		keynumbers="";
		String input="";
		while (a!=17) {
			System.out.println("Input " +a +". " +" number:");
			input=sc.next();
			if(input.matches("^\\d*$")){
				if(keynumbers.equals("")) {
					keynumbers=input;
					a++;	
				}
				else {
					keynumbers=keynumbers +"," +input;
					a++;	
				}

			}
			else {
				System.out.println("wrong input!");
			}
		}

		
		
	}
	public static void program() {
		bfr();
		String[] split = text.split(",");
		input();
	}
	public static void count() {
		String[] n = numbers.split(",");
		String[] k = keynumbers.split(",");
		
		
		int a=0;
		System.out.println("Numbers___________________");
		while (a!=16) {
			System.out.println(n[a] +" " +n[a+1] +" " +n[a+2] +" " +n[a+3]);
			a=a+4;
		}
		System.out.println("Keyboard__________________");
		a=0;
		while (a!=16) {
			System.out.println(k[a] +" " +k[a+1] +" " +k[a+2] +" " +k[a+3]);
			a=a+4;
		}
		System.out.println("Count_____________________");
		a=0;
		int ni=1;
		int ki=1;
		int c=1;
		
		while (a!=16) {
			ni=Integer.parseInt(n[a]);
			ki=Integer.parseInt(k[a]);
			c=ni+ki;
			if(a==3 || a==7 || a==11) {
				System.out.println(c +" ");	
			}
			else {
				System.out.print(c +" ");
			}
			a++;
		}
		
		
		
		
							
	}

	public static void main(String[] args) {

		txtgenerate();
		program();
		count();
		
	}

}
