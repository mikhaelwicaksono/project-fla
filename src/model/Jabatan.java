package model;

public abstract class Jabatan {
	private String kode_karyawan;
	private String nama_karyawan;
	private String jenis_kelamin;
	private String jabatan;
	private Integer gaji;
	public Jabatan(String kode_karyawan, String nama_karyawan, String jenis_kelamin, String jabatan, Integer gaji) {
		super();
		this.kode_karyawan = kode_karyawan;
		this.nama_karyawan = nama_karyawan;
		this.jenis_kelamin = jenis_kelamin;
		this.jabatan = jabatan;
		this.gaji = gaji;
	}
	public String getKode_karyawan() {
		return kode_karyawan;
	}
	public void setKode_karyawan(String kode_karyawan) {
		this.kode_karyawan = kode_karyawan;
	}
	public String getNama_karyawan() {
		return nama_karyawan;
	}
	public void setNama_karyawan(String nama_karyawan) {
		this.nama_karyawan = nama_karyawan;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public Integer getGaji() {
		return gaji;
	}
	public void setGaji(Integer gaji) {
		this.gaji = gaji;
	}
	
	
    public abstract int Gaji_kotor();
	
}
