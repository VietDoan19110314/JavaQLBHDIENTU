package mypack;
import java.util.Date;
public class NhanVien {
	int idnhanvien;
	String tennhanvien;
	String gioitinh;
	Date ngaysinh;
	String diachi;
	Date ngaybatdaulam;
	double luongthang;
	CuaHang CuaHang;

	public NhanVien (NhanVien nv){
		this.idnhanvien = nv.idnhanvien;
		this.tennhanvien = nv.tennhanvien;
		this.gioitinh = nv.gioitinh;
		this.ngaysinh = nv.ngaysinh;
		this.diachi = nv.diachi;
		this.ngaybatdaulam = nv.ngaybatdaulam;
		this.luongthang = nv.luongthang;
		this.CuaHang = nv.CuaHang;
	}
	
	public NhanVien (int idnhanvien, String tennhanvien, String gioitinh, Date ngaysinh, String diachi, Date ngaybatdaulam, double luongthang, CuaHang CuaHang ){
		this.idnhanvien = idnhanvien;
		this.tennhanvien = tennhanvien;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.ngaybatdaulam = ngaybatdaulam;
		this.luongthang = luongthang;
		this.CuaHang = CuaHang;
	}
	public int getIDNhanVien() {
		return idnhanvien;
	}
	
	public String getTenNhanVien() {
		return tennhanvien;
	}
	
	public String getGioiTinh() {
		return gioitinh;
	}
	
	public Date getNgaysinh() {
		return ngaysinh;
	}
	
	public String getDiaChi() {
		return diachi;
	}
	
	public Date getNgayBatDauLam() {
		return ngaybatdaulam;
	}
	
	public double getLuongThang() {
		return luongthang;
	}
	public CuaHang getCuaHang() {
		return CuaHang;
	}

	
	
}
