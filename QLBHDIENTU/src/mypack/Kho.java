package mypack;

public class Kho {
	CuaHang CuaHang;
	SanPham SanPham;
	int soluong;
	public Kho(Kho k){
		this.CuaHang = k.CuaHang;
		this.SanPham = k.SanPham;
		this.soluong = k.soluong;
	}
	
	public Kho(CuaHang CuaHang, SanPham SanPham, int soluong){
		this.CuaHang = CuaHang;
		this.SanPham = SanPham;
		this.soluong = soluong;
	}
	

	public CuaHang getIDCuahang() {
		return CuaHang;
	}
	
	public SanPham getIDSanpham() {
		return SanPham;
	}
	public int getSoLuong() {
		return soluong;
	}
	
}
