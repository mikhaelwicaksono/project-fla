package singleton;

import java.util.Vector;

import model.Jabatan;

public class typeJabatan {
	private static typeJabatan typeJabatan;
	public Vector<Jabatan> jabatanList = new Vector<>();

	public static typeJabatan gettypeJabatan() {
		if (typeJabatan == null) {
			typeJabatan = new typeJabatan();
		}
		return typeJabatan;
	}
	public void addtypeJabatan(Jabatan jabatan) {
		jabatanList.add(jabatan);
	}
}
