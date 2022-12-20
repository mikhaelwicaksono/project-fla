package main;

import java.util.*;

import factory.Curd;


public class Main {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	Curd curd = new Curd();

	public Main() {
		int inp;
		do {
			System.out.println(" Employe Data System ");
			System.out.println("=====================");
			System.out.println("1. Add Karyawan");
			System.out.println("2. View All Karyawan");
			System.out.println("3. Update Karyawan");
			System.out.println("4. Delete Karyawan");
			System.out.println("5. Exit");
			System.out.println("=====================");
			System.out.print(">>  ");
			inp = scan.nextInt();
			switch (inp) {
			case 1:
				curd.addNewKaryawan();
				break;
			case 2:
				curd.viewAllKaryawan();
				break;
			case 3:
				curd.viewAllKaryawan();
				curd.addUpdatetunjangan();
				break;
			case 4:
				curd.deleteKaryawan();
				break;
			default:
				break;
			}
			
		} while (inp != 5);
	}


	public static void main(String[] args) {
		new Main();

	}

}
