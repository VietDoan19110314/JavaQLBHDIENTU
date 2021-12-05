package mypack;

public class CuaHang {
	int idcuahang;
	String diachi;
	String sdt;
	String email;
	
	public CuaHang(CuaHang ch){
		this.idcuahang = ch.idcuahang;
		this.diachi = ch.diachi;
		this.sdt = ch.sdt;
		this.email = ch.email;
	}
	
	public CuaHang(int idcuahang, String diachi, String sdt, String email){
		this.idcuahang = idcuahang;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	

	public int getIDCuahang() {
		return idcuahang;
	}
	
	public String getDiaChi() {
		return diachi;
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public String getEmail() {
		return diachi;
	}
}
