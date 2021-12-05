package mypack;

public class NhaCungCap {
	int idnhacungcap;
	String tennhacungcap;
	String diachi;
	String sdt;
	String email;
	
	public NhaCungCap (NhaCungCap ncc){
		this.idnhacungcap = ncc.idnhacungcap;
		this.tennhacungcap = ncc.tennhacungcap;
		this.diachi = ncc.diachi;
		this.sdt = ncc.sdt;
		this.email = ncc.email;
	}
	
	public NhaCungCap (int idnhacungcap, String tennhacungcap, String diachi, String sdt, String email){
		this.idnhacungcap = idnhacungcap;
		this.tennhacungcap = tennhacungcap;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	
	public int getIDNhaCungCap() {
		return idnhacungcap;
	}
	
	public String getTenNhaCungCap() {
		return tennhacungcap;
	}
	
	public String getDiaChi() {
		return diachi;
	}
	
	public String getSDT() {
		return sdt;
	}
	
	public String getEmail() {
		return email;
	}
	
	
}
