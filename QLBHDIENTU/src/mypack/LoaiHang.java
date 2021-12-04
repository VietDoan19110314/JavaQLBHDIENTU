package mypack;

public class LoaiHang {
	int idloaihang;
	String tenloaihang;
	
	public LoaiHang(LoaiHang lh){
		this.idloaihang = lh.idloaihang;
		this.tenloaihang = lh.tenloaihang;
	}
	
	public LoaiHang(int idloaihang, String tenloaihang){
		this.idloaihang = idloaihang;
		this.tenloaihang = tenloaihang;
	}
	

	public int getIDLoaiHang() {
		return idloaihang;
	}
	
	public String getTenLoaiHang() {
		return tenloaihang;
	}
	
}
