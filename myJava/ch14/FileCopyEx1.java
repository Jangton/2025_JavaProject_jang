package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyEx1 {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("원본파일 : ");
			String sFile = sc.nextLine();
			System.out.print("복사파일 : ");
			String cFile = sc.nextLine();
			FileReader fr = new FileReader("ch14/" + sFile);
			FileWriter fw = new FileWriter("ch14/" + cFile);
			int a;
			while((a=fr.read())!=-1) {
				fw.write(a);
			}
			fw.flush();
			fw.close();
			fr.close();
			sc.close();
			System.out.println("Copy End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
