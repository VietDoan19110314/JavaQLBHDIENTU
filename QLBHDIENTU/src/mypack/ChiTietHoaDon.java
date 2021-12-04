package mypack;

public class ChiTietHoaDon {
	HoaDon HoaDon;
	SanPham SanPham;
	int soluong;
	int giamgia;
	
	public ChiTietHoaDon(ChiTietHoaDon cthd){
		this.HoaDon = cthd.HoaDon;
		this.SanPham = cthd.SanPham;
		this.soluong = cthd.soluong;
		this.giamgia = cthd.giamgia;
	}
	
	public ChiTietHoaDon(HoaDon HoaDon, SanPham SanPham, int soluong, int giamgia){
		this.HoaDon = HoaDon;
		this.SanPham = SanPham;
		this.soluong = soluong;
		this.giamgia = giamgia;
	}
	
	public HoaDon HoaDon() {
		return HoaDon;
	}
	public SanPham SanPham() {
		return SanPham;
	}
	public int getSoLuong() {
		return soluong;
	}
	public int getGiamGia() {
		return giamgia;
	}

}
