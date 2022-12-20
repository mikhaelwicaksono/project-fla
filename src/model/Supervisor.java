package model;

public class Supervisor extends Jabatan {

	public Supervisor(String kode_karyawan, String nama_karyawan, String jenis_kelamin, String jabatan, Integer gaji) {
		super(kode_karyawan, nama_karyawan, jenis_kelamin, jabatan, gaji);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Gaji_kotor() {
		Integer gajiKotor = 15000000;
		return gajiKotor;
	}


}
