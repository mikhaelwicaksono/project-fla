package entity;

public class Admin extends Jabatan{

	public Admin(String kode_karyawan, String nama_karyawan, String jenis_kelamin, String jabatan, Integer gaji) {
		super(kode_karyawan, nama_karyawan, jenis_kelamin, jabatan, gaji);
	}

	@Override
	public int Gaji_kotor() {
		Integer gajiKotor = 6000000;
		return gajiKotor;
	}


	
	



}
