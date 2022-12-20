package CURD;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import entity.Admin;
import entity.Direksi;
import entity.Jabatan;
import entity.Manager;
import entity.Supervisor;

public class Curd {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	Vector <Jabatan> listJabatan = new Vector<>();
	
	public Curd() {
	}
	
	public void addNewKaryawan() {
		int addInp;
		do {
			System.out.println("\n");
			System.out.println("====================");
			System.out.println("1. Input karyawan");
			System.out.println("2. View Karyawan");
			System.out.println("3. back");
			System.out.print(">>  ");
			addInp = scan.nextInt();
			switch (addInp) {
			case 1:
				String nama, jenis_kelamin, jabatan;
				Integer gaji = null;
				String kode_karyawan;
				kode_karyawan = "KW" + ran.nextInt(10) + ran.nextInt(10) + ran.nextInt(10);
				System.out.println("kode karyawan: " + kode_karyawan);
				do {
					System.out.print("Input nama karyawan: ");
					nama = scan.next();
				} while (nama.length() < 5);
				do {
					System.out.print("Input jenis kelamin: ");
					jenis_kelamin = scan.next();
				} while (!(jenis_kelamin.equalsIgnoreCase("Laki-laki") || jenis_kelamin.equalsIgnoreCase("Perempuan")));
				do {
					System.out.print("Input jabatan: ");
					jabatan = scan.next();
				} while (!(jabatan.equalsIgnoreCase("Direksi") || jabatan.equalsIgnoreCase("Manager") || jabatan.equalsIgnoreCase("Supervisor") || jabatan.equalsIgnoreCase("Admin")));
				if (jabatan.equalsIgnoreCase("Direksi")) {
					listJabatan.add(new Direksi(kode_karyawan, nama, jenis_kelamin, jabatan, gaji));
				}else if (jabatan.equalsIgnoreCase("Manager")) {
					listJabatan.add(new Manager(kode_karyawan, nama, jenis_kelamin, jabatan, gaji));
				}else if (jabatan.equalsIgnoreCase("Supervisor")) {
					listJabatan.add(new Supervisor(kode_karyawan, nama, jenis_kelamin, jabatan, gaji));
				}else if (jabatan.equalsIgnoreCase("Admin")) {
					listJabatan.add(new Admin(kode_karyawan, nama, jenis_kelamin, jabatan, gaji));
				}
				break;
			case 2:
				viewKaryawan();
				break;
			default:
				break;
			}
		} while (addInp != 3);
	}
	
	
	public void viewKaryawan() {
		int i = 1;
		System.out.println("| No | Karyawan ID     | Nama Karyawan   | Jenis Kelamin | Jabatan Karyawan | Gaji kotor | ");
		for (Jabatan jabatan2 : listJabatan) {
			if (jabatan2.getGaji() == null) {
				System.out.println(String.format("| %d  | %-15s | %-15s | %-13s | %-14s | %-10d |", i, jabatan2.getKode_karyawan(), jabatan2.getNama_karyawan(), jabatan2.getJenis_kelamin(), jabatan2.getJabatan(), jabatan2.Gaji_kotor()));
			}else {
				System.out.println(String.format("| %d  | %-15s | %-15s | %-13s | %-14s | %-10d |", i, jabatan2.getKode_karyawan(), jabatan2.getNama_karyawan(), jabatan2.getJenis_kelamin(), jabatan2.getJabatan(), jabatan2.getGaji()));
			}
			i++;
		}
		gajiBersih();

	}
	
	public void viewAllKaryawan() {
		int i = 1;
		System.out.println("| No | Karyawan ID     | Nama Karyawan   | Jenis Kelamin | Jabatan Karyawan | Gaji kotor | ");
		for (Jabatan jabatan2 : listJabatan) {
			if (jabatan2.getGaji() == null) {
				System.out.println(String.format("| %d  | %-15s | %-15s | %-13s | %-14s | %-10d |", i, jabatan2.getKode_karyawan(), jabatan2.getNama_karyawan(), jabatan2.getJenis_kelamin(), jabatan2.getJabatan(), jabatan2.Gaji_kotor()));
			}else {
				System.out.println(String.format("| %d  | %-15s | %-15s | %-13s | %-14s | %-10d |", i, jabatan2.getKode_karyawan(), jabatan2.getNama_karyawan(), jabatan2.getJenis_kelamin(), jabatan2.getJabatan(), jabatan2.getGaji()));
			}
			i++;
		}
	}
	
	
	public void gajiBersih() {
		for (Jabatan jabatan : listJabatan) {
			if (jabatan.getGaji() == null) {
				Integer biayaJabatan = (int) (jabatan.Gaji_kotor() * 0.05);
				Integer BPJS = 60000;
				Integer PPh21 = 97500;
				Integer totalPengurangan = biayaJabatan + BPJS + PPh21;
				Integer gaji_Bersih = jabatan.Gaji_kotor() - totalPengurangan;
				System.out.println("\s");
				System.out.println("------Detail Gaji Karyawan------");
				System.out.println("Nama Karyawan :  " + jabatan.getNama_karyawan());
				System.out.println("Biaya Jabatan : " + biayaJabatan);
				System.out.println("Iuran BPJS : " + BPJS);
				System.out.println("PPh21 : " + PPh21);
				System.out.println("Total Pengurangan : " + totalPengurangan);
				System.out.println("GAJI BERSIH :  " + gaji_Bersih);
				System.out.println("---------------------------------");
			}else {
				Integer biayaJabatan = (int) (jabatan.getGaji() * 0.05);
				Integer BPJS = 60000;
				Integer PPh21 = 97500;
				Integer totalPengurangan = biayaJabatan + BPJS + PPh21;
				Integer gaji_Bersih = jabatan.getGaji() - totalPengurangan;
				System.out.println("\s");
				System.out.println("------Detail Gaji Karyawan------");
				System.out.println("Nama Karyawan :  " + jabatan.getNama_karyawan());
				System.out.println("Biaya Jabatan : " + biayaJabatan);
				System.out.println("Iuran BPJS : " + BPJS);
				System.out.println("PPh21 : " + PPh21);
				System.out.println("Total Pengurangan : " + totalPengurangan);
				System.out.println("GAJI BERSIH :  " + gaji_Bersih);
				System.out.println("---------------------------------");
			}
		
		}
	}

	
	public void addUpdatetunjangan() {
		if (listJabatan.isEmpty()) {
			System.out.println("No Data");
		}else {
			Integer index;
			do {
				System.out.println("Total data " + listJabatan.size());
				index = scan.nextInt();
				scan.nextLine();
			} while (index < 1 || index > listJabatan.size());
			String anggota_keluarga;
			Integer gaji = 0;
			System.out.print("Input anggota keluarga: ");
			anggota_keluarga = scan.next();
			for (Jabatan jabatan : listJabatan) {
				if (anggota_keluarga.equalsIgnoreCase("Istri") || anggota_keluarga.equalsIgnoreCase("Suami")) {
					gaji = (int) ((jabatan.Gaji_kotor() * 0.04) + jabatan.Gaji_kotor());					
				}else if(anggota_keluarga.equalsIgnoreCase("Anak")) {
					gaji = (int) ((jabatan.Gaji_kotor() * 0.01) + jabatan.Gaji_kotor());
				}
			}
			scan.nextLine();
			listJabatan.get(index - 1).setGaji(gaji);
		}
	}
	
	public void deleteKaryawan() {
		if (listJabatan.size() > 0) {
			viewAllKaryawan();
		}else {
			System.out.println();
		}
		int index;
		do {
			System.out.println("Choose Index Number to Delete");
			index = scan.nextInt();
			scan.nextLine();
			if(index >= 1 && index <= listJabatan.size()){
		        if(index <= listJabatan.size()){
		            listJabatan.remove(index-1);
		            break;
		        }
		    } else {
		        System.out.println("Wrong Index");
		    }
			
		} while (!(index >= 1 && index <= listJabatan.size()));
		System.out.println();

	}

}
