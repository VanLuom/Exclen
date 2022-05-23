package advance1.dev;

import java.util.Scanner;

import advance.dev.models.dao.IManager;
import advance.dev.models.dao.Manager;
import advance.dev.models.Students;
import advance.dev.models.Teacher;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao 2 sinh vien");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ten");
			String name = sc.nextLine();
			System.out.println("Nhap tuoi");
			int old = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nhap diem");
			double mark = sc.nextDouble();
			sc.nextLine();
			manager.add(new Students(name, old, mark));
		}
		
		System.out.println("Nhap vao 2 giao vien");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ten");
			String name = sc.nextLine();
			System.out.println("Nhap tuoi");
			int old = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nhap salary");
			double salary = sc.nextDouble();
			sc.nextLine();
			manager.add(new Teacher(name, old, salary));
		
		manager.print();
		System.out.println("Diem cao nhat");
		manager.findExcellentStudents();
		System.out.println("Luong cao nhat");
		manager.findExcellentTeacher();
	}
}
}