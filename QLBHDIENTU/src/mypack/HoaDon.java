package mypack;

import java.util.Date;

public class HoaDon {
	int idhoadon;;
	Date ngaylaphoadon;
	NhanVien NhanVien;
	KhachHang KhachHang;
	CuaHang CuaHang;
	
	public HoaDon(HoaDon hd){
		this.idhoadon = hd.idhoadon;
		this.ngaylaphoadon = hd.ngaylaphoadon;
		this.NhanVien = hd.NhanVien;
		this.KhachHang = hd.KhachHang;
		this.CuaHang = hd.CuaHang;
	}
	
	public HoaDon(int idhoadon, Date ngaylaphoadon, NhanVien NhanVien, KhachHang KhachHang, CuaHang CuaHang){
		this.idhoadon = idhoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.NhanVien = NhanVien;
		this.KhachHang = KhachHang;
		this.CuaHang = CuaHang;
	}
	
	public int getIDHoadon() {
		return idhoadon;
	}
	public Date getNgayLapHoaDon() {
		return ngaylaphoadon;
	}
	public NhanVien NhanVien() {
		return NhanVien;
	}
	public KhachHang KhachHang() {
		return KhachHang;
	}
	public CuaHang CuaHang() {
		return CuaHang;
	}
	
	
}
