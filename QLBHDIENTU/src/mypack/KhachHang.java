package mypack;

import java.util.Date;

public class KhachHang {
	int idkhachhang;
	String tenkhachhang;
	String gioitinh;
	Date ngaysinh;
	String sdt;
	String email;
	String diachi;
	
	public KhachHang (KhachHang kh){
		this.idkhachhang = kh.idkhachhang;
		this.tenkhachhang = kh.tenkhachhang;
		this.gioitinh = kh.gioitinh;
		this.ngaysinh = kh.ngaysinh;
		this.sdt = kh.sdt;
		this.email = kh.email;
		this.diachi = kh.diachi;
	}
	
	public KhachHang (int idkhachhang, String tenkhachhang, String gioitinh, Date ngaysinh, String sdt, String email, String diachi){
		this.idkhachhang = idkhachhang;
		this.tenkhachhang = tenkhachhang;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.sdt = sdt;
		this.email = email;
		this.diachi = diachi;
	}
	
	public int getIDKhachHang() {
		return idkhachhang;
	}
	
	public String getTenKhachHang() {
		return tenkhachhang;
	}
	
	public String getGioiTinh() {
		return gioitinh;
	}
	
	public Date getNgaySinh() {
		return ngaysinh;
	}
	
	public String getSDT() {
		return sdt;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDiaChi() {
		return diachi;
	}
}
